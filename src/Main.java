public class Main {
    public static void main(String[] args) {
        Movie meuFilme = new Movie();
        meuFilme.name = "Toy Story";
        meuFilme.durationInMinutes = 90;
        meuFilme.includesOnPlan = true;
        meuFilme.ratingSum = 9;
        meuFilme.ratingTotal = 1;
        meuFilme.releaseYear = 1995;

        meuFilme.showTechnicalDataSheet();
        meuFilme.rate(10);
        meuFilme.rate(5);
        meuFilme.rate(6);
        meuFilme.showTechnicalDataSheet();
    }
}
