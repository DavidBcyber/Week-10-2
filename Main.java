
import java.util.Scanner;  // Import the Scanner class
class Main {
    public class GradeCalculator
        {
            // Method to calculate grade for assignments
            public static double CalculateAssignmentsGrade(double assignmentsScore)
            {
                return assignmentsScore;
            }

            // Method to calculate grade for midterms
            public static double CalculateMidtermsGrade(double midtermsScore)
            {
                return midtermsScore;
            }

            // Method to calculate grade for final exams
            public static double CalculateFinalExamsGrade(double finalExamsScore)
            {
                return finalExamsScore;
            }

            // Method to calculate the final grade based on weighted average
            public static double CalculateFinalGrade(double assignmentsScore, double midtermsScore, double finalExamsScore)
            {
                double assignmentsWeight = 0.40; // 40% for assignment
                double midtermsWeight = 0.30; // 30% for the mid term
                double finalExamsWeight = 0.30; // 30% for the Final Exam

                double finalGrade = (assignmentsScore * assignmentsWeight) + (midtermsScore * midtermsWeight) + (finalExamsScore * finalExamsWeight);
                return finalGrade;
            }

            public static void Main(String[] args)
            {
                // Allow user to input scores
                Scanner Grade = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Enter the score for assignments:");
                double assignmentsScore = Grade.nextDouble();

                System.out.println("Enter the score for midterms:");
                double midtermsScore = Grade.nextDouble();

                System.out.println("Enter the score for final exams:");
                double finalExamsScore = Grade.nextDouble();
                // Calculate the final grade
                double finalGrade = CalculateFinalGrade(assignmentsScore, midtermsScore, finalExamsScore);

                // Display the final grade for the student to see
                System.out.println("Final Grade: " + finalGrade);
            }
        }
}