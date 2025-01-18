import java.util.Random;

public class SimpleStudentGradeCalculator{

    // Method to generate random marks for Physics, Chemistry, and Maths for students
    public static int[][] generateRandomScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3]; // 3 subjects for each student

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = random.nextInt(51) + 50;  // Physics
            scores[i][1] = random.nextInt(51) + 50;  // Chemistry
            scores[i][2] = random.nextInt(51) + 50;  // Maths
        }

        return scores;
    }

    // Method to calculate total, average, percentage, and grade for each student
    public static void displayResults(int[][] scores, int numStudents) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");

        for (int i = 0; i < numStudents; i++) {
            int physics = scores[i][0];
            int chemistry = scores[i][1];
            int maths = scores[i][2];
            int total = physics + chemistry + maths;
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Determine grade based on percentage
            String grade = "";
            if (percentage >= 90) grade = "A+";
            else if (percentage >= 80) grade = "A";
            else if (percentage >= 70) grade = "B+";
            else if (percentage >= 60) grade = "B";
            else if (percentage >= 50) grade = "C";
            else grade = "F";

            // Display student results
            System.out.printf("%d\t%d\t\t%d\t%d\t%d\t%.2f\t%.2f%%\t\t%s\n", 
                              i+1, physics, chemistry, maths, total, average, percentage, grade);
        }
    }

    public static void main(String[] args) {
        // Number of students
        int numStudents = 5;

        // Generate random marks for each student
        int[][] scores = generateRandomScores(numStudents);

        // Display the results (scorecard)
        displayResults(scores, numStudents);
    }
}
