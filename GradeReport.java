public class GradeReport {

    public static void executeGradeReport(double score) {
        if (!validateScore(score)) {
            System.out.println("Invalid Score");
            return;
        }

        char grade = calculateLetterGrade(score);
        displayPerformanceMessage(grade);
    }

    public static boolean validateScore(double score) {
        return score >= 0 && score <= 100;
    }

    public static char calculateLetterGrade(double score) {
        if (score >= 90) return 'A';
        if (score >= 80) return 'B';
        if (score >= 70) return 'C';
        if (score >= 60) return 'D';
        return 'F';
    }

    public static void displayPerformanceMessage(char grade) {
        switch (grade) {
            case 'A': System.out.println("Excellent work!"); break;
            case 'B': System.out.println("Good job!"); break;
            case 'C': System.out.println("Average performance."); break;
            case 'D': System.out.println("You need to improve."); break;
            case 'F': System.out.println("Failing grade."); break;
        }
    }

    public static void main(String[] args) {
        executeGradeReport(92);   // Example: Excellent work!
        executeGradeReport(75);   // Example: Average performance.
        executeGradeReport(58);   // Example: Failing grade.
        executeGradeReport(105);  // Example: Invalid Score
    }
}
