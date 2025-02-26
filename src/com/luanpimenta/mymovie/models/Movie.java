package com.luanpimenta.mymovie.models;

import com.luanpimenta.mymovie.calculations.Classification;

public class Movie extends Title implements Classification {
    private String director;

    public Movie(String name, int releaseYear) {
        super(name, releaseYear);
    }

    public String getDirector(){
        return director;
    }

    @Override
    public int getClassification(){
        return ((int) ratingAverage())/2;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Filme: %s (%s)".formatted(this.getName(), this.getReleaseYear());
    }
}