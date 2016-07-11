package com.tr.microsvcs.dw.resources;

import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Optional;
import com.tr.microsvcs.dw.dao.SpreadsheetDao;
import com.tr.microsvcs.dw.model.SearchableSpreadsheet;
import com.tr.microsvcs.dw.model.SpreadsheetSearchResponseItemModel;
import com.tr.microsvcs.dw.model.SpreadsheetSearchResponseModel;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.*;

/**
 * Created by u6034037 on 7/11/2016.
 */
@Path("/{ssSubType:(workpapers|templates)}/{firmId}/")
@Produces(MediaType.APPLICATION_JSON)
public class SpreadsheetResource {
    private SpreadsheetDao dao;
    private int defaultMaxResults;

    public SpreadsheetResource(SpreadsheetDao dao, int defaultMaxResults) {
        this.dao = dao;
        this.defaultMaxResults = defaultMaxResults;
    }

    @GET
    @Timed
    public SpreadsheetSearchResponseModel get(@PathParam("firmId") long firmId
            , @PathParam("ssSubType") String ssSubType
            , @QueryParam("query") String qString
            , @QueryParam("maxResults") Optional<Integer> maxResults ) {

        List<SearchableSpreadsheet> sss = dao.search(firmId,qString,ssSubType.substring(0,ssSubType.length()-1),maxResults.or(defaultMaxResults));

        return searchableSpreadsheetsToResponseModel(ssSubType,sss);
    }

    private SpreadsheetSearchResponseModel searchableSpreadsheetsToResponseModel(String ssSubType, List<SearchableSpreadsheet> sss) {

        SpreadsheetSearchResponseModel response = new SpreadsheetSearchResponseModel(sss.size(), ssSubType);

        List<SpreadsheetSearchResponseItemModel> ssResponseItems = new ArrayList<SpreadsheetSearchResponseItemModel>();

        for (SearchableSpreadsheet ss: sss) {

            ssResponseItems.add(new SpreadsheetSearchResponseItemModel(
                            ss.getSpreadsheetId(),
                            ss.getName(),
                            ss.getSpreadsheetType())
            );
        }
        response.setResults(ssResponseItems);
        return response;
    }
}