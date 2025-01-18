import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {  
     // Create a input object for user input
        Scanner input = new Scanner(System.in);

        // Ask the user to input a number
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        // Check if the input number is a natural number
        if (n <= 0) {
            System.out.println("Please enter a valid natural number greater than 0.");
        } else {
            // Calculate the sum using the while loop
            int sum= 0;
            int i = 1;

            while (i <= n) {
                sum += i;
                i++;
            }

            // Calculate the sum using the formula
            int sumFormula = n * (n + 1) / 2;

            // Print both results
            System.out.println("Sum using while loop: " + sum);
            System.out.println("Sum using formula (n*(n+1)/2): " + sumFormula);

            // Compare the results
            if (sum == sumFormula) {
                System.out.println("Both results are correct and match!");
            } else {
                System.out.println("Something went wrong! Results do not match.");
            }
        }

        // Close the input object
        input.close();
    }
}
