import java.util.Scanner;

public class FindFactors {
    public static void main(String[] args) {
        // Create input object for input
        Scanner input = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // check  the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive number.");
        }

        // Initialize variables and array
        int maxFactor = 10; 
        int[] factors = new int[maxFactor];
        int index = 0;

        // Find factors and store them in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { 
                // If factors array is full, expand the array
                if (index == maxFactor) {
                    maxFactor *= 2; // Double the size of the array
                    int[] temp = new int[maxFactor]; // Temporary array to hold expanded factors
                    System.arraycopy(factors, 0, temp, 0, factors.length); // Copy existing factors to temp array
                    factors = temp; // Assign the expanded array back to factors
                }
                factors[index] = i; // Store the factor in the array
                index++; // Increment the index
            }
        }

        // Display the factors
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        // Close the scanner
        input.close();
    }
}
