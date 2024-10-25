import com.luanpimenta.mymovie.calculations.RecommendationFilter;
import com.luanpimenta.mymovie.calculations.TimeCalculator;
import com.luanpimenta.mymovie.models.Episode;
import com.luanpimenta.mymovie.models.Movie;
import com.luanpimenta.mymovie.models.Tv;

public class Main {
    public static void main(String[] args) {
        RecommendationFilter filtroRecomendacao = new RecommendationFilter();

        // ======================= MOVIE =======================
        System.out.println("----- FILME: Toy Story -----");
        Movie meuFilme = new Movie();
        meuFilme.setName("Toy Story");
        meuFilme.setDurationInMinutes(90);
        meuFilme.setincludesOnPlan(true);
        meuFilme.setReleaseYear(1995);
        meuFilme.setDirector("John Lasseter");
        meuFilme.rate(10);
        meuFilme.rate(5);
        meuFilme.rate(6);

        meuFilme.showTechnicalDataSheet();
        System.out.printf("Diretor: %s %n", meuFilme.getDirector());
        System.out.println("Classificação: " + meuFilme.getClassification());
        filtroRecomendacao.filter(meuFilme);

        // Outros filmes para o cálculo de tempo total
        Movie meuFilme2 = new Movie();
        meuFilme2.setDurationInMinutes(100);

        Movie meuFilme3 = new Movie();
        meuFilme3.setDurationInMinutes(120);

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
        minhaSerie.rate(8);
        minhaSerie.rate(8.8);
        minhaSerie.rate(9);

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
    }
}