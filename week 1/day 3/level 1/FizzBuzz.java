import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Validate input (ensure the number is positive)
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;  // Exit the program if the number is not positive
        }

        // Create a String array to store the results
        String[] results = new String[number + 1];  // Array size is number + 1 to include 0 to number

        // Loop from 0 to the number and apply FizzBuzz logic
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";  // Multiple of both 3 and 5
            } else if (i % 3 == 0) {
                results[i] = "Fizz";  // Multiple of 3
            } else if (i % 5 == 0) {
                results[i] = "Buzz";  // Multiple of 5
            } else {
                results[i] = Integer.toString(i);  // Otherwise, save the number itself
            }
        }

        // Print the results
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + (i + 1) + " = " + results[i]);
        }

        // Close the scanner
        input.close();
    }
}
