import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if the student can vote based on their age

    public boolean canStudentVote(int age) {
        // Validate if age is negative
        if (age <0) {
            return false; // If the age is negative, the student cannot vote
        }
        
        // Check if age is 18 or above
        if (age >= 18) {
            return true; // The student can vote
        } else {
            return false; // The student cannot vote
        }
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Create an array to store the ages of 10 students
        int[] ages = new int[10];

        // Create an instance of StudentVoteChecker to use the non-static method
        StudentVoteChecker obj = new StudentVoteChecker();

        // Loop through the array and take the age input for each student
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
            
            // Check if the student can vote
            boolean canVote = obj.canStudentVote(ages[i]);

            // Display the result
            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        // Close the input
        input.close();
    }
}
