public class Movie {
    String name;
    int releaseYear;
    boolean includesOnPlan;
    double ratingSum;
    int ratingTotal;
    int durationInMinutes;

    void showTechnicalDataSheet(){
        System.out.printf("""
                Nome: %s
                Data lançamento: %d
                Incluso: %b
                Soma das Avaliações: %.1f
                Quantidade avaliações: %d
                Média avaliações: %.1f
                Duração (minutos): %d
                """, name, releaseYear, includesOnPlan, ratingSum, ratingTotal, ratingAverage(), durationInMinutes);
    }

    void rate(double number){
        ratingSum += number;
        ratingTotal++;
    }

    double ratingAverage(){
        return ratingSum / ratingTotal;
    }
}
