import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        // Create a input object for user input
        Scanner input = new Scanner(System.in);

        // take input for number from user
        System.out.print("Enter the first number: ");
        double first = input.nextDouble();
        
        System.out.print("Enter the second number: ");
        double second = input.nextDouble();
        
        System.out.print("Enter the operator (+, -, *, /): ");
        String op = input.next();

        // Initialize the result variable
        double result = 0;

        // Perform operations using switch...case
        switch (op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    input.close();
                    return;
                }
                break;
            default:
                System.out.println("Invalid Operator.");
                input.close();
                return;
        }

        // Print the result
        System.out.println("Result: " + result);

        // Close input
        input.close();
    }
}
