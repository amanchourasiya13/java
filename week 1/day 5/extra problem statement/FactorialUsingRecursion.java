import java.util.Scanner;

public class FactorialUsingRecursion{

    // Function to take input from the user
    public static int takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int n = scanner.nextInt();
        return n;
    }

    // Recursive function to calculate the factorial of a number
    public static int calculateFactorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: n * factorial of (n-1)
        return n * calculateFactorial(n - 1);
    }

    // Function to display the result
    public static void displayResult(int n, int result) {
        System.out.println("The factorial of " + n + " is: " + result);
    }

    public static void main(String[] args) {
        // Taking input from the user
        int number = takeInput();

        // Calculating the factorial using recursion
        int result = calculateFactorial(number);

        // Displaying the result
        displayResult(number, result);
    }
}
