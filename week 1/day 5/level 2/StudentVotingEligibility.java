import java.util.Random;
import java.util.Scanner;

public class StudentVotingEligibility{

    // Method to generate random ages for n students
    public static int[] generateRandomAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];
        
        for (int i = 0; i < n; i++) {
            // Generate random age between 10 and 99 (two-digit numbers)
            ages[i] = random.nextInt(90) + 10;
        }
        
        return ages;
    }

    // Method to check whether students can vote based on their age
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        
        for (int i = 0; i < ages.length; i++) {
            // Check if the age is valid and if the student can vote
            if (ages[i] < 0) {
                result[i][1] = "Cannot Vote (Invalid Age)";
            } else if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
            result[i][0] = String.valueOf(ages[i]);  // Age of student
        }
        
        return result;
    }

    // Method to display the results in a tabular format
    public static void displayResults(String[][] result) {
        System.out.println("Age\tCan Vote");
        System.out.println("--------------------");
        
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" + result[i][1]);
        }
    }

    public static void main(String[] args) {
        // Scanner for user input
        Scanner input = new Scanner(System.in);
        
        // Input number of students
        System.out.print("Enter the number of students in the class: ");
        int numStudents = input.nextInt();
        
        // Generate random ages for students
        int[] ages = generateRandomAges(numStudents);
        
        // Check voting eligibility
        String[][] eligibility = checkVotingEligibility(ages);
        
        // Display the results
        displayResults(eligibility);
        
        // Close the scanner
        input.close();
    }
}
