package com.example.iluth.pam.model;

/**
 * Created by iluth on 29/10/18.
 */

import com.example.iluth.pam.model.Movie;

import java.util.List;


public class MovieResponse {
    private List<Movie> results;

    public MovieResponse() {
    }

    public MovieResponse(List<Movie> results) {
        this.results = results;
    }

    public List<Movie> getResults() {
        return results;
    }

    public void setResults(List<Movie> results) {
        this.results = results;
    }
}