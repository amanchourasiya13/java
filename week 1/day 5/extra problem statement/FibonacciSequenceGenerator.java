import java.util.Scanner;

public class FibonacciSequenceGenerator{

    // Function to take input from the user (number of terms)
    public static int takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        int n = scanner.nextInt();
        return n;
    }

    // Function to generate the Fibonacci sequence up to the specified number of terms
    public static void generateFibonacci(int terms) {
        // Edge cases: if the number of terms is less than or equal to 0
        if (terms <= 0) {
            System.out.println("Please enter a positive number of terms.");
            return;
        }

        // First two Fibonacci numbers
        int first = 0, second = 1;

        // Handle case for the first term (0) and second term (1)
        if (terms == 1) {
            System.out.println(first);
            return;
        } else if (terms == 2) {
            System.out.println(first + "\n" + second);
            return;
        }

        // Print the first two numbers (0 and 1)
        System.out.print(first + " " + second + " ");

        // Generate the Fibonacci sequence starting from the 3rd term
        for (int i = 3; i <= terms; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;  // Update the first number
            second = next;   // Update the second number
        }
        System.out.println();  // To ensure proper line formatting after the sequence
    }

    public static void main(String[] args) {
        // Taking the number of terms as input
        int terms = takeInput();

        // Generating and displaying the Fibonacci sequence
        generateFibonacci(terms);
    }
}
