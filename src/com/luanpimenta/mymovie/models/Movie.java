package com.luanpimenta.mymovie.models;

import java.time.LocalDate;

public class Movie extends Title {
    private String director;

    public String getDirector(){
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}