import com.luanpimenta.mymovie.calculations.RecommendationFilter;
import com.luanpimenta.mymovie.calculations.TimeCalculator;
import com.luanpimenta.mymovie.models.Episode;
import com.luanpimenta.mymovie.models.Movie;
import com.luanpimenta.mymovie.models.Tv;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        RecommendationFilter filtroRecomendacao = new RecommendationFilter();

<<<<<<< HEAD
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
=======
        // ======================= MOVIE: Toy Story =======================
        System.out.println("----- FILME: Toy Story -----");
        Movie toyStory = new Movie();
        toyStory.setName("Toy Story");
        toyStory.setDurationInMinutes(90);
        toyStory.setincludesOnPlan(true);
        toyStory.setReleaseYear(1995);
        toyStory.setDirector("John Lasseter");
        toyStory.rate(9);
        toyStory.rate(7);
        toyStory.rate(8);
        toyStory.showTechnicalDataSheet();
        System.out.printf("Diretor: %s %n", toyStory.getDirector());
        System.out.println("Classificação: " + toyStory.getClassification());
        filtroRecomendacao.filter(toyStory);
>>>>>>> c9289fd085abae91a4d434716fb4ad483dab4af2

        // ======================= MOVIE: Vingadores =======================
        System.out.println("\n----- FILME: Vingadores -----");
        Movie vingadores = new Movie();
        vingadores.setName("Vingadores");
        vingadores.setDurationInMinutes(143);
        vingadores.setincludesOnPlan(true);
        vingadores.setReleaseYear(2012);
        vingadores.setDirector("Joss Whedon");
        vingadores.rate(9);
        vingadores.rate(8);
        vingadores.rate(9);
        vingadores.showTechnicalDataSheet();
        System.out.printf("Diretor: %s %n", vingadores.getDirector());
        System.out.println("Classificação: " + vingadores.getClassification());
        filtroRecomendacao.filter(vingadores);

<<<<<<< HEAD
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

=======
        // ======================= MOVIE: Star Wars Episódio IV =======================
        System.out.println("\n----- FILME: Star Wars Episódio IV -----");
        Movie starWars = new Movie();
        starWars.setName("Star Wars: Episódio IV - Uma Nova Esperança");
        starWars.setDurationInMinutes(121);
        starWars.setincludesOnPlan(false);
        starWars.setReleaseYear(1977);
        starWars.setDirector("George Lucas");
        starWars.rate(10);
        starWars.rate(9);
        starWars.rate(8);
        starWars.showTechnicalDataSheet();
        System.out.printf("Diretor: %s %n", starWars.getDirector());
        System.out.println("Classificação: " + starWars.getClassification());
        filtroRecomendacao.filter(starWars);

        // ======================= MARATONA DE FILMES =======================
        System.out.println("\n----- MARATONA DE FILMES -----");
        ArrayList<Movie> maratonaDeFilmes = new ArrayList<>();
        maratonaDeFilmes.add(toyStory);
        maratonaDeFilmes.add(vingadores);
        maratonaDeFilmes.add(starWars);
        System.out.println("Tamnaho da maratona: " + maratonaDeFilmes.size());
        System.out.println("Primeiro filme: " + maratonaDeFilmes.getFirst().getName());
        System.out.println(maratonaDeFilmes);
>>>>>>> c9289fd085abae91a4d434716fb4ad483dab4af2


        // ======================= TV SHOW: Dark =======================
        System.out.println("\n----- SÉRIE: Dark -----");
<<<<<<< HEAD
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
=======
        Tv dark = new Tv();
        dark.setName("Dark");
        dark.setincludesOnPlan(true);
        dark.setReleaseYear(2017);
        dark.setSeasons(3);
        dark.setEpisodesForSeason(8);
        dark.setMinutesForEpisode(60);
        dark.setIsActive(false);
        dark.rate(8);
        dark.rate(8.8);
        dark.rate(9);
        dark.showTechnicalDataSheet();
        System.out.printf("""
>>>>>>> c9289fd085abae91a4d434716fb4ad483dab4af2
                Temporadas: %d
                Episódios por temporada: %d
                Está ativa: %b
                """, dark.getSeasons(), dark.getEpisodesForSeason(), dark.getIsActive());
        System.out.println("Classificação: " + dark.getClassification());
        filtroRecomendacao.filter(dark);

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
        calculator.includes(toyStory);
        calculator.includes(vingadores);
        calculator.includes(starWars);
        calculator.includes(dark);

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
