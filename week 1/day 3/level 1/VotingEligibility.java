import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        // Create a input object 
           Scanner input = new Scanner(System.in);

        // Define an array 
           int[] ages = new int[10];

        // Loop the array and take input for each student's age
            for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt(); // Get the age from user input

        // Check if the age is positive or negative 
            if (ages[i] < 0) {
                System.out.println("Invalid age entered.");
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
          }

        // Close the input object
            input.close();
    }
}
