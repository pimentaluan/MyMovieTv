import com.luanpimenta.mymovie.model.Movie;

public class Main {
    public static void main(String[] args) {
        Movie meuFilme = new Movie();
        meuFilme.setName("Toy Story");
        meuFilme.setDurationInMinutes(90);
        meuFilme.setincludesOnPlan(true);
        meuFilme.setReleaseYear(1995);

        meuFilme.rate(10);
        meuFilme.rate(5);
        meuFilme.rate(6);
        System.out.println("Total de avaliações: " + meuFilme.getRatingTotal());
        meuFilme.showTechnicalDataSheet();

        meuFilme.setReleaseYear(2025);
        System.out.println(meuFilme.getReleaseYear());
    }
}
