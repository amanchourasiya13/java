import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        // Create a input object
        Scanner input = new Scanner(System.in);

        // Ask the user to input a number
        System.out.print("Enter a number to find its multiplication table from 6 to 9: ");
        int number = input.nextInt();

        // Use a for loop to print the multiplication table for 6 to 9
        for (int i = 6; i <= 9; i++) {

            // Print the multiplication in the format number * i = result
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        // Close the scanner object to prevent resource leak
        input.close();
    }
}
