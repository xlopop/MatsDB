package com.matsdb.loicr.moviedb.ui.models;

import java.util.List;

/**
 * Created by loicr on 24/05/2017.
 */

public class SearchTV {
    int page, total_results, total_pages;
    List<TVs> results;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotal_results() {
        return total_results;
    }

    public void setTotal_results(int total_results) {
        this.total_results = total_results;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public List<TVs> getResults() {
        return results;
    }

    public void setResults(List<TVs> results) {
        this.results = results;
    }
}
