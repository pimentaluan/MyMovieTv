package com.luanpimenta.mymovie.main;

import com.luanpimenta.mymovie.models.Movie;
import com.luanpimenta.mymovie.models.Title;
import com.luanpimenta.mymovie.models.Tv;

import java.util.ArrayList;

public class MainList {
    public static void main(String[] args) {
        Movie meuFilme = new Movie("Toy Story", 1995);
        meuFilme.rate(9.3);

        Movie meuFilme1 = new Movie("Vingadores", 2012);
        meuFilme1.rate(9.5);

        Movie meuFilme2 = new Movie("Viva a Vida é uma Festa", 2017);
        meuFilme2.rate(10);

        Movie meuFilme3 = new Movie("Star Wars: Episódio IV - Uma Nova Esperança", 1977);
        meuFilme3.rate(9.2);

        Tv minhaSerie = new Tv("Dark", 2017);
        minhaSerie.rate(10);

        ArrayList<Title> listaDeAssitidos = new ArrayList<>();
        listaDeAssitidos.add(meuFilme);
        listaDeAssitidos.add(meuFilme1);
        listaDeAssitidos.add(meuFilme2);
        listaDeAssitidos.add(meuFilme3);
        listaDeAssitidos.add(minhaSerie);

        System.out.println("Minha lista de assistidos:");
        for (int e=0; e < listaDeAssitidos.size(); e++){
            Title item = listaDeAssitidos.get(e);
            System.out.println(listaDeAssitidos.get(e));
            if (item instanceof Movie filme){
                System.out.println("Classificação de "+ filme.getName() + ": " + filme.getClassification());
            }
        }
    }
}
