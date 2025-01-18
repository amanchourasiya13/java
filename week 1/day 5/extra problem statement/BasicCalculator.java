import java.util.Scanner;

public class BasicCalculator{

    // Function to perform addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Function to perform subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Function to perform multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Function to perform division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; // Return 'Not a Number' to indicate error
        }
        return a / b;
    }

    // Function to take input from the user
    public static double takeInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    // Function to display the result
    public static void displayResult(double result) {
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display menu to the user
        System.out.println("Basic Calculator");
        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        // Taking user choice
        System.out.print("Enter the number corresponding to your choice (1/2/3/4): ");
        int choice = scanner.nextInt();

        // Taking two numbers as input from the user
        double num1 = takeInput("Enter the first number: ");
        double num2 = takeInput("Enter the second number: ");

        double result = 0;

        // Performing the selected operation
        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = subtract(num1, num2);
                break;
            case 3:
                result = multiply(num1, num2);
                break;
            case 4:
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Invalid choice! Please choose a valid operation.");
                return; // Exit if the user enters an invalid choice
        }

        // Displaying the result
        displayResult(result);
    }
}
