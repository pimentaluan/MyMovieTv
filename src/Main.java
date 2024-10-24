import com.luanpimenta.mymovie.calculations.RecommendationFilter;
import com.luanpimenta.mymovie.calculations.TimeCalculator;
import com.luanpimenta.mymovie.models.Episode;
import com.luanpimenta.mymovie.models.Movie;
import com.luanpimenta.mymovie.models.Tv;

public class Main {
    public static void main(String[] args) {
        //Class Movie
        Movie meuFilme = new Movie();
        meuFilme.setName("Toy Story");
        meuFilme.setDurationInMinutes(90);
        meuFilme.setincludesOnPlan(true);
        meuFilme.setReleaseYear(1995);
        meuFilme.setDirector("Tarantino");
        meuFilme.rate(10);
        meuFilme.rate(5);
        meuFilme.rate(6);
        meuFilme.showTechnicalDataSheet();
        System.out.printf("Diretor: %s %n", meuFilme.getDirector());
        System.out.println(meuFilme.getClassification());

        Movie meuFilme2 = new Movie();
        meuFilme2.setDurationInMinutes(100);

        Movie meuFilme3 = new Movie();
        meuFilme3.setDurationInMinutes(120);


        //Class Tv
        System.out.println(" ");
        Tv minhaSerie = new Tv();
        minhaSerie.setName("Dark");
        minhaSerie.setincludesOnPlan(true);
        minhaSerie.setReleaseYear(2017);
        minhaSerie.setSeasons(3);
        minhaSerie.setEpisodesForSeason(8);
        minhaSerie.setMinutesForEpisode(60);
        minhaSerie.setIsActive(false);
        minhaSerie.rate(8);
        minhaSerie.rate(8.8);
        minhaSerie.rate(9);

        minhaSerie.showTechnicalDataSheet();
        System.out.println("""
                Temporadas: %d
                Episódios por temporada: %d
                Está ativa: %b
                """.formatted(minhaSerie.getSeasons(), minhaSerie.getEpisodesForSeason(), minhaSerie.getIsActive()));

        //Class episode
        Episode meuEpisodio = new Episode();
        meuEpisodio.setNumber(1);
        meuEpisodio.setName("Episódio 1");
        meuEpisodio.setTv(minhaSerie);
        meuEpisodio.setTotalVisualisation(200);
        System.out.println("Classificação: " + meuEpisodio.getClassification());

        RecommendationFilter filtroRecomendacao = new RecommendationFilter();
        filtroRecomendacao.filter(meuEpisodio);


        TimeCalculator calculator = new TimeCalculator();
        calculator.includes(meuFilme);
        calculator.includes(meuFilme2);
        calculator.includes(meuFilme3);
        calculator.includes(minhaSerie);
        System.out.println("Tempo aproximado da maratona (em horas): " + calculator.getTotalMinutes());
    }
}
