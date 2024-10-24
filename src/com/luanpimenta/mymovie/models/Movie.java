package com.luanpimenta.mymovie.models;

import com.luanpimenta.mymovie.calculations.Classification;

public class Movie extends Title implements Classification {
    private String director;
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

}