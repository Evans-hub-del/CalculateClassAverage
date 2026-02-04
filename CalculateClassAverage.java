public class CalculateClassAverage {

    // Version 1: two scores
    public static double calculateClassAverage(double score1, double score2) {
        return (score1 + score2) / 2;
    }

    // Version 2: three scores
    public static double calculateClassAverage(double score1, double score2, double score3) {
        return (score1 + score2 + score3) / 3;
    }

    // Version 3: array of scores
    public static double calculateClassAverage(double[] scores) {
        double sum = 0;

        for (double score : scores) {
            sum += score;
        }

        return sum / scores.length;
    }

    // Main method (for testing)
    public static void main(String[] args) {

        System.out.println(calculateClassAverage(75, 85)); //expeceted result: 80
        System.out.println(calculateClassAverage(70, 85, 90)); // expected result: 81.66666666666667

        double[] classScores = {75, 80, 85, 90};
        System.out.println(calculateClassAverage(classScores));
    }
}
