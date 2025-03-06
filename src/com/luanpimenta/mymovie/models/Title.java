package com.luanpimenta.mymovie.models;

import com.luanpimenta.mymovie.exceptions.ConvertYearException;

import java.time.LocalDate;

public class Title {
    private String name;
    private int releaseYear;
    private boolean includesOnPlan;
    private double ratingSum;
    private int ratingTotal;
    private int durationInMinutes;

    public Title(String name, int releaseYear){
        this.setName(name);
        this.setReleaseYear(releaseYear);
    }

    public Title(TitleOmdb meuTituloOmdb) {
        this.name = meuTituloOmdb.title();

        if(meuTituloOmdb.year().length() > 4) {
            throw new ConvertYearException("Não consegui converter o ano " +
                    "porque tem mais de 04 caracteres.");
        }
        this.releaseYear = Integer.valueOf(meuTituloOmdb.year());
        this.durationInMinutes = Integer.valueOf(meuTituloOmdb.runtime().substring(0, 2));
    }

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

    @Override
    public String toString(){
        return "Título: %s (%s)".formatted(this.getName(), this.getReleaseYear());
    }

}
