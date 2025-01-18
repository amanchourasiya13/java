import java.util.Scanner;

public class OddEvenNumbers {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask the user to input natural number
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Check if the number is a positive integer (Natural Number)
        if (number <= 0) {
            System.out.println("Please enter a valid positive integer.");
        } else {

        // Iterate from 1 to the entered number
            for (int i = 1; i <= number; i++) {

        // Check if the number is even or odd
                if (i % 2 == 0) {
                    System.out.println(i + " is even.");
                } else {
                    System.out.println(i + " is odd.");
                }
            }
        }

        // Close the input object
           input.close();
    }
}
