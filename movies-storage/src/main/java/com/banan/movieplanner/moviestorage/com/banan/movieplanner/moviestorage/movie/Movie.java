package com.banan.movieplanner.moviestorage.com.banan.movieplanner.moviestorage.movie;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Year;
import java.util.Collections;
import java.util.List;

public class Movie {
    @JsonProperty("title")
    private String title;
    @JsonProperty("genres")
    private List<String> genres;
    @JsonProperty("year")
    private Year year;

    public Movie(){}

    public Movie(String title, List<String> genres, Year year) {
        this.title = title;
        this.genres = Collections.unmodifiableList(genres);
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getGenres() {
        return genres;
    }
//
//    public Year getYear() {
//        return year;
//    }
}
