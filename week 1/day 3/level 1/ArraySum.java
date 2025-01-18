import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {

        // Create an array  or variables 
        double[] multiple = new double[10];
        double total = 0.0; 
        int index = 0;
        
        Scanner input = new Scanner(System.in);

        // Infinite while loop to take user input

        while (true) {
            System.out.print("Enter a number (enter 0 or a negative number to stop): ");
            double number = input.nextDouble();

            // Check if the user entered 0 or a negative number
            if (number <= 0 || index >= 10) {
                break;
            }

            // Store the number in the array and increment the index
            multiple[index] = number;
            index++;
        }

        // Calculate the sum using a for loop
        for (int i = 0; i < index; i++) {
            total += multiple[i];
        }

        // Display the entered numbers and the total sum
        System.out.println("\nEntered numbers:");

        for (int i = 0; i < index; i++) {
            System.out.println(multiple[i]);
        }

        System.out.println("\nTotal sum of entered numbers: " + total);

        input.close();
    }
}
