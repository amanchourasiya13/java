import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {

        // Create a input object for user input
        Scanner input = new Scanner(System.in);

        // Get inputs for the base number and power
        System.out.print("Enter the base number: ");
        int number =  input.nextInt();

        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // Initialize result variable
        int result = 1;

        // Loop to calculate the power
        for (int i = 1; i <= power; i++) {
            result *= number; // Multiply result by the base number
        }

        // Print the result
        System.out.println(number + " raised to the power " + power + " is: " + result);

        //close the input
        input.close();
    }
}
