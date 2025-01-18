import java.util.Scanner;
public class Calculator {
public static void main(String[] args) {
    // Create a Scanner object for user input
        Scanner input  = new Scanner(System.in);

    // user to input two numbers
        System.out.print("Enter first number: ");
        float numberOne = input.nextFloat();

        System.out.print("Enter second number: ");
        float numberTwo = input.nextFloat();

        // Perform the arithmetic operations
        float addition = numberOne + numberTwo;
        float subtraction = numberOne - numberTwo;
        float multiplication = numberOne * numberTwo;
        float division = numberOne / numberTwo;

    // Print the results
         System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+ numberOne+" and "+ numberTwo +" is"+addition+","+subtraction+", "+multiplication+" and "+division);

        // Close the input
        input.close();
    }
}
