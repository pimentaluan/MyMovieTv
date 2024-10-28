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


        // ======================= TV SHOW: Dark =======================
        System.out.println("\n----- SÉRIE: Dark -----");
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
    }
}
