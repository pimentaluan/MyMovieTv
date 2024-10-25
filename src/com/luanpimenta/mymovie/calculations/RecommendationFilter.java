package com.luanpimenta.mymovie.calculations;

public class RecommendationFilter {

    public void filter (Classification classification){
        if (classification.getClassification() >=4 ){
            System.out.println("Está entre os preferidos do momento!");
        }else if (classification.getClassification() >= 2){
            System.out.println("Bem avaliado!");
        }else{
            System.out.println("Assista depois!");
        }
    }
}
