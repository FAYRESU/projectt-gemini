package tpm;

public class GradeCalculator {

    public static char calculateGrade(int score) {
        if (score >= 80 && score <= 100) {
            return 'A';
        } else if (score >= 70 && score < 80) {
            return 'B';
        } else if (score >= 60 && score < 70) {
            return 'C';
        } else if (score >= 50 && score < 60) {
            return 'D';
        } else if (score >= 0 && score < 50) {
            return 'F';
        } else {
            return 'X'; // Invalid score
        }
    }
}
