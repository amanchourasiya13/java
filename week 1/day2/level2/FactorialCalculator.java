import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        // Create a input object to take user input
           Scanner input = new Scanner(System.in);

        // Ask the user to input a number
           System.out.print("Enter a positive integer: ");
           int number = input.nextInt();

        // Check if the number is positive
            if (number < 0) {
            System.out.println("Please enter a positive integer.");
             } else {
        // Initialize the factorial result as 1
            long factorial = 1;

        // Calculate factorial using a while loop
            int i = 1;
            while (i <= number) {
                factorial *= i;  // Multiply the current value of factorial by i
                i++;  // Increment i to move to the next integer
            }

        // Print the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        // Close the input object 
        input.close();
    }
}
