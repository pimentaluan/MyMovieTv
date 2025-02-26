package com.luanpimenta.mymovie.main;

import com.luanpimenta.mymovie.calculations.RecommendationFilter;
import com.luanpimenta.mymovie.calculations.TimeCalculator;
import com.luanpimenta.mymovie.models.Episode;
import com.luanpimenta.mymovie.models.Movie;
import com.luanpimenta.mymovie.models.Tv;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        RecommendationFilter filtroRecomendacao = new RecommendationFilter();

        // ======================= MOVIE: Toy Story =======================
        System.out.println("----- FILME: Toy Story -----");
        Movie meuFilme = new Movie("Toy Story", 1995);
        meuFilme.setDurationInMinutes(90);
        meuFilme.setincludesOnPlan(true);
        meuFilme.setDirector("John Lasseter");
        meuFilme.rate(9);
        meuFilme.rate(7);
        meuFilme.rate(8);
        meuFilme.showTechnicalDataSheet();
        System.out.printf("Diretor: %s %n", meuFilme.getDirector());
        System.out.println("Classificação: " + meuFilme.getClassification());
        filtroRecomendacao.filter(meuFilme);

        // ======================= MOVIE: Vingadores =======================
        System.out.println("\n----- FILME: Vingadores -----");
        Movie meuFilme1 = new Movie("Vingadores", 2012);
        meuFilme1.setDurationInMinutes(143);
        meuFilme1.setincludesOnPlan(true);
        meuFilme1.setDirector("Joss Whedon");
        meuFilme1.rate(9);
        meuFilme1.rate(8);
        meuFilme1.rate(9);
        meuFilme1.showTechnicalDataSheet();
        System.out.printf("Diretor: %s %n", meuFilme1.getDirector());
        System.out.println("Classificação: " + meuFilme1.getClassification());
        filtroRecomendacao.filter(meuFilme1);

        // ======================= MOVIE 2 =======================
        System.out.println("""
                
                ----- FILME 2: -----""");
        Movie meuFilme2 = new Movie("Viva a Vida é uma Festa", 2017);
        meuFilme2.setDurationInMinutes(105);
        meuFilme2.setincludesOnPlan(true);
        meuFilme2.setDirector("Adrian Molina");
        meuFilme2.rate(10);
        meuFilme2.rate(8.6);
        meuFilme2.rate(8.8);

        meuFilme2.showTechnicalDataSheet();
        System.out.printf("Diretor: %s %n", meuFilme2.getDirector());
        System.out.println("Classificação: " + meuFilme2.getClassification());
        filtroRecomendacao.filter(meuFilme2);


        // ======================= MOVIE: Star Wars Episódio IV =======================
        System.out.println("\n----- FILME: Star Wars Episódio IV -----");
        Movie meuFilme3 = new Movie("Star Wars: Episódio IV - Uma Nova Esperança", 1977);
        meuFilme3.setDurationInMinutes(121);
        meuFilme3.setincludesOnPlan(false);
        meuFilme3.setDirector("George Lucas");
        meuFilme3.rate(10);
        meuFilme3.rate(9);
        meuFilme3.rate(8);
        meuFilme3.showTechnicalDataSheet();
        System.out.printf("Diretor: %s %n", meuFilme3.getDirector());
        System.out.println("Classificação: " + meuFilme3.getClassification());
        filtroRecomendacao.filter(meuFilme3);

        // ======================= MARATONA DE FILMES =======================
        System.out.println("\n----- MARATONA DE FILMES -----");
        ArrayList<Movie> maratonaDeFilmes = new ArrayList<>();
        maratonaDeFilmes.add(meuFilme);
        maratonaDeFilmes.add(meuFilme1);
        maratonaDeFilmes.add(meuFilme2);
        maratonaDeFilmes.add(meuFilme3);
        System.out.println("Tamnaho da maratona: " + maratonaDeFilmes.size());
        System.out.println("Primeiro filme: " + maratonaDeFilmes.getFirst().getName());
        System.out.println(maratonaDeFilmes);


        // ======================= TV SHOW: Dark =======================
        System.out.println("\n----- SÉRIE: Dark -----");
        Tv dark = new Tv("Dark", 2017);
        dark.setincludesOnPlan(true);
        dark.setSeasons(3);
        dark.setEpisodesForSeason(8);
        dark.setMinutesForEpisode(60);
        dark.setIsActive(false);
        dark.rate(8);
        dark.rate(8.8);
        dark.rate(9);
        dark.showTechnicalDataSheet();
        System.out.printf("""
                Temporadas: %d
                Episódios por temporada: %d
                Está ativa: %b
                """, dark.getSeasons(), dark.getEpisodesForSeason(), dark.getIsActive());
        System.out.println("Classificação: " + dark.getClassification());
        filtroRecomendacao.filter(dark);
        System.out.println("""
        =======
        """);

        // ======================= EPISÓDIO: Segredos (Dark) =======================
        System.out.println("\n----- EPISÓDIO: Segredos (Dark) -----");
        Episode episodioSegredos = new Episode();
        episodioSegredos.setNumber(1);
        episodioSegredos.setName("Segredos");
        episodioSegredos.setTv(dark);
        episodioSegredos.setTotalVisualisation(200);

        System.out.println("Nome: " + episodioSegredos.getName());
        System.out.println("Classificação: " + episodioSegredos.getClassification());
        filtroRecomendacao.filter(episodioSegredos);

        // ======================= TIME CALCULATION =======================
        TimeCalculator calculator = new TimeCalculator();
        calculator.includes(meuFilme);
        calculator.includes(meuFilme1);
        calculator.includes(meuFilme2);
        calculator.includes(meuFilme3);
        calculator.includes(dark);

        System.out.println("\n----- TEMPO TOTAL -----");
        System.out.println("Tempo total aproximado da maratona (em horas): " + calculator.getTotalMinutes());

        // ======================= MOVIES LIST =======================
        System.out.println("\n----- LISTA DE FILMES -----");
        ArrayList<Movie> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(meuFilme1);
        listaDeFilmes.add(meuFilme2);
        listaDeFilmes.add(meuFilme3);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getName());

        System.out.println(listaDeFilmes);
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());


    }
}