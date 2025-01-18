import java.util.Scanner;

public class NaturalNumberSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Take user input
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();
        
        // Check if the number is a natural number
        if (n <= 0) {
            System.out.println("The input is not a natural number. Exiting...");
            return; // Exit if the number is not natural
        }

        // Calculate the sum using recursion
        int recursiveSum = sumRecursive(n);

        // Calculate the sum using the formula n*(n+1)/2
        int formulaSum = sumFormula(n);

        // Print both results
        System.out.println("Sum of first " + n + " natural numbers using recursion: " + recursiveSum);
        System.out.println("Sum of first " + n + " natural numbers using the formula: " + formulaSum);

        // Compare the two results
        if (recursiveSum == formulaSum) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("There is a mismatch between the two methods.");
        }
    }

    // Method to find the sum of first n natural numbers using recursion
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1; // Base case: sum of first 1 natural number is 1
        } else {
            return n + sumRecursive(n - 1); // Recursive case
        }
    }

    // Method to find the sum of first n natural numbers using the formula
    public static int sumFormula(int n) {
        return (n * (n + 1)) / 2; // Formula for the sum of first n natural numbers
    }
}
