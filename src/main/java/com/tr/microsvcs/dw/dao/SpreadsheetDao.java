package com.tr.microsvcs.dw.dao;

import com.tr.microsvcs.dw.model.SearchableSpreadsheet;

import java.util.List;

/**
 * Created by u6034037 on 7/11/2016.
 */
public interface SpreadsheetDao {
    List<SearchableSpreadsheet> search(long firmId, String qString, String ssSubType, int maxResults);
}
