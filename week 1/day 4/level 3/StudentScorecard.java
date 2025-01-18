import java.util.Scanner;

public class StudentScorecard{

    public static void main(String[] args) {
// create input object.
        Scanner input = new Scanner(System.in);

        // Step 1: Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        // Step 2: Generate random scores for Physics, Chemistry, and Maths
        int[][] pcmScores = generateRandomScores(numStudents);

        // Step 3: Calculate total, average, and percentage
        double[][] results = calculateResults(pcmScores);

        // Step 4: Display the scorecard
        displayScorecard(pcmScores, results);

        input.close();
    }

    // Method to generate random scores for Physics, Chemistry, and Math
    public static int[][] generateRandomScores(int numStudents) {
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = (int) (Math.random() * 41) + 60; // Random score between 60-100 for Physics
            scores[i][1] = (int) (Math.random() * 41) + 60; // Random score between 60-100 for Chemistry
            scores[i][2] = (int) (Math.random() * 41) + 60; // Random score between 60-100 for Math
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Rounded to 2 decimals
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Rounded to 2 decimals
        }
        return results;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("\nScorecard:");
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.print("S" + (i + 1) + "  \t");
            System.out.print(scores[i][0] + "  \t");
            System.out.print(scores[i][1] + "  \t\t");
            System.out.print(scores[i][2] + "  \t");
            System.out.print((int) results[i][0] + "  \t"); // Total
            System.out.print(results[i][1] + "  \t");      // Average
            System.out.print(results[i][2] + "  %\n");    // Percentage
        }
    }
}