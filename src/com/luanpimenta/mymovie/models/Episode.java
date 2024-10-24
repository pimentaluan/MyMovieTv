package com.luanpimenta.mymovie.models;

import com.luanpimenta.mymovie.calculations.Classification;

public class Episode implements Classification {
    private int number;
    private String name;
    private Tv tv;
    private int totalVisualisation;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tv getTv() {
        return tv;
    }

    public void setTv(Tv tv) {
        this.tv = tv;
    }

    public int getTotalVisualisation() {
        return totalVisualisation;
    }

    public void setTotalVisualisation(int totalVisualisation) {
        this.totalVisualisation = totalVisualisation;
    }

    @Override
    public int getClassification() {
        if (totalVisualisation < 200){
            System.out.println("Não tem views suficientes");
            return 0;
        }else{
            return (int) getTv().ratingAverage() /2 ;
        }
    }

}
