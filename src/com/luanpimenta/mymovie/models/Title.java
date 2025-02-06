package com.luanpimenta.mymovie.models;

import java.time.LocalDate;

public class Title {
    private String name;
    private int releaseYear;
    private boolean includesOnPlan;
    private double ratingSum;
    private int ratingTotal;
    private int durationInMinutes;


    public void showTechnicalDataSheet(){
        System.out.printf("""
                Nome: %s
                Data lançamento: %s
                Incluso: %b
                Média avaliações: %.1f
                Duração (minutos): %d
                """, getName(), getReleaseYear(), includesOnPlan, ratingAverage(), getDurationInMinutes());
    }

    public int getRatingTotal(){
        return ratingTotal;
    }

    public String getName() {
        return name;
    }

    public String getReleaseYear() {
        int currentYear = LocalDate.now().getYear();
        if ( releaseYear <= currentYear && releaseYear > 1800){
            return String.valueOf(releaseYear);
        }else{
            return "Ano inválido";
        }
    }

    public boolean isIncludesOnPlan() {
        return includesOnPlan;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDurationInMinutes(int durationInMinutes){
        this.durationInMinutes = durationInMinutes;
    }

    public void setincludesOnPlan(boolean includesOnPlan){
        this.includesOnPlan = includesOnPlan;
    }

    public void setReleaseYear(int releaseYear){
        int currentYear = LocalDate.now().getYear();
        if ( releaseYear <= currentYear && releaseYear > 1800){
            this.releaseYear = releaseYear;
        }else{
            System.out.println("Ano inválido!");
        }
    }

    public void rate(double number){
        ratingSum += number;
        ratingTotal++;
    }

    public double ratingAverage(){
        return ratingSum / ratingTotal;
    }

}
