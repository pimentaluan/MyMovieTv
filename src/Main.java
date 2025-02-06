import com.luanpimenta.mymovie.calculations.RecommendationFilter;
import com.luanpimenta.mymovie.calculations.TimeCalculator;
import com.luanpimenta.mymovie.models.Episode;
import com.luanpimenta.mymovie.models.Movie;
import com.luanpimenta.mymovie.models.Tv;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        RecommendationFilter filtroRecomendacao = new RecommendationFilter();

        // ======================= MOVIE =======================
        System.out.println("----- FILME 1: -----");
        Movie meuFilme = new Movie("Toy Story");
        meuFilme.setDurationInMinutes(81);
        meuFilme.setincludesOnPlan(true);
        meuFilme.setReleaseYear(1995);
        meuFilme.setDirector("John Lasseter");
        meuFilme.rate(10);
        meuFilme.rate(7.8);
        meuFilme.rate(8.4);

        meuFilme.showTechnicalDataSheet();
        System.out.printf("Diretor: %s %n", meuFilme.getDirector());
        System.out.println("Classificação: " + meuFilme.getClassification());
        filtroRecomendacao.filter(meuFilme);

        // ======================= MOVIE 2 =======================
        System.out.println("""
                
                ----- FILME 2: -----""");
        Movie meuFilme2 = new Movie("Viva a Vida é uma Festa");
        meuFilme2.setDurationInMinutes(105);
        meuFilme2.setincludesOnPlan(true);
        meuFilme2.setReleaseYear(2017);
        meuFilme2.setDirector("Adrian Molina");
        meuFilme2.rate(10);
        meuFilme2.rate(8.6);
        meuFilme2.rate(8.8);

        meuFilme2.showTechnicalDataSheet();
        System.out.printf("Diretor: %s %n", meuFilme2.getDirector());
        System.out.println("Classificação: " + meuFilme2.getClassification());
        filtroRecomendacao.filter(meuFilme2);

        // ======================= MOVIE 3 =======================
        System.out.println("""
                
                ----- FILME 3: -----""");
        Movie meuFilme3 = new Movie("Os Vingadores");
        meuFilme3.setDurationInMinutes(143);
        meuFilme3.setincludesOnPlan(true);
        meuFilme3.setReleaseYear(2012);
        meuFilme3.setDirector("Joss Whedon");
        meuFilme3.rate(10);
        meuFilme3.rate(9.2);
        meuFilme3.rate(9.4);

        meuFilme3.showTechnicalDataSheet();
        System.out.printf("Diretor: %s %n", meuFilme3.getDirector());
        System.out.println("Classificação: " + meuFilme3.getClassification());
        filtroRecomendacao.filter(meuFilme3);


        // ======================= TV SHOW =======================
        System.out.println("\n----- SÉRIE: Dark -----");
        Tv minhaSerie = new Tv();
        minhaSerie.setName("Dark");
        minhaSerie.setincludesOnPlan(true);
        minhaSerie.setReleaseYear(2017);
        minhaSerie.setSeasons(3);
        minhaSerie.setEpisodesForSeason(8);
        minhaSerie.setMinutesForEpisode(60);
        minhaSerie.setIsActive(false);
        minhaSerie.rate(7);
        minhaSerie.rate(6.8);
        minhaSerie.rate(8);

        minhaSerie.showTechnicalDataSheet();
        System.out.println("""
                Temporadas: %d
                Episódios por temporada: %d
                Está ativa: %b""".formatted(minhaSerie.getSeasons(), minhaSerie.getEpisodesForSeason(), minhaSerie.getIsActive()));
        System.out.println("Classificação: " + minhaSerie.getClassification());
        filtroRecomendacao.filter(minhaSerie);

        // ======================= EPISÓDIO =======================
        System.out.println("\n----- EPISÓDIO: Segredos -----");
        Episode meuEpisodio = new Episode();
        meuEpisodio.setNumber(1);
        meuEpisodio.setName("Segredos");
        meuEpisodio.setTv(minhaSerie);
        meuEpisodio.setTotalVisualisation(200);

        System.out.println("Nome: " + meuEpisodio.getName());
        System.out.println("Classificação: " + meuEpisodio.getClassification());
        filtroRecomendacao.filter(meuEpisodio);

        // ======================= TIME CALCULATION =======================
        TimeCalculator calculator = new TimeCalculator();
        calculator.includes(meuFilme);
        calculator.includes(meuFilme2);
        calculator.includes(meuFilme3);
        calculator.includes(minhaSerie);

        System.out.println("\n----- TEMPO TOTAL -----");
        System.out.println("Tempo total aproximado da maratona (em horas): " + calculator.getTotalMinutes());

        // ======================= MOVIES LIST =======================
        System.out.println("\n----- LISTA DE FILMES -----");
        ArrayList<Movie> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(meuFilme2);
        listaDeFilmes.add(meuFilme3);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getName());

        System.out.println(listaDeFilmes);
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());


    }
}