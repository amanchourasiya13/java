import java.util.Scanner;

public class OddEvenProgram {
    public static void main(String[] args) {
        // Create a scanner for input
        Scanner input = new Scanner(System.in);

        // take number from user
        System.out.print("Enter a number: ");
        int  number = input.nextInt();

         // Validate if the input is a valid positive integer (natural number)
            if (number <= 0) {
                System.out.println( " Please enter a positive natural number.");
            }

        // Create arrays for odd and even numbers (size = number / 2 + 1)
        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];

        // Initialize index variables for odd and even arrays
        int oddIndex = 0;
        int evenIndex = 0;

        // Iterate from 1 to the number and categorize numbers into odd and even arrays
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else {
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }

        // Print the odd numbers array
        System.out.println("Odd numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        // Print the even numbers array
        System.out.println("\nEven numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        input.close();
    }
}
