package com.tr.microsvcs.dw.dao.Impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tr.microsvcs.dw.dao.SpreadsheetDao;
import com.tr.microsvcs.dw.model.SearchableSpreadsheet;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.Client;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.elasticsearch.search.SearchHit;

import static org.elasticsearch.index.query.QueryBuilders.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by u6034037 on 7/11/2016.
 */
public class SpreadsheetDaoImpl implements SpreadsheetDao {

    private static final String SS_TYPE = "spreadsheet";
    Client client;
    String index;
    ObjectMapper mapper = new ObjectMapper();

    public SpreadsheetDaoImpl (Client client, String index) {
        this.client = client;
        this.index = index;
    }

    @Override
    public List<SearchableSpreadsheet> search(long firmId, String qString, String ssSubType, int maxResults) {

        List<SearchableSpreadsheet> sss = new ArrayList<>();

        String[] excludedFields = new String[] { "file", "attributes"};

        BoolQueryBuilder q = boolQuery()
                .must(queryStringQuery(qString)
                        .analyzeWildcard(true)
                        .allowLeadingWildcard(false)
                        .defaultField("file.content")
                        .defaultOperator(QueryStringQueryBuilder.Operator.AND)
                        .lowercaseExpandedTerms(true))
                .filter(
                        boolQuery()
                                .must(termQuery("firmId", firmId))
                                .must(termQuery("spreadsheetType", ssSubType))
                );

        SearchResponse response = client.prepareSearch(index)
                .setTypes(SS_TYPE)
//                .setSearchType(SearchType.DFS_QUERY_AND_FETCH)
                .setFetchSource(null, excludedFields)
                .setQuery(q)
                .setSize(maxResults)
                .execute()
                .actionGet();

        for (SearchHit hit: response.getHits().getHits()) {
            try {
                SearchableSpreadsheet ss = mapper.readValue(hit.source(), SearchableSpreadsheet.class);
                sss.add(ss);
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
        return sss;
    }
}
