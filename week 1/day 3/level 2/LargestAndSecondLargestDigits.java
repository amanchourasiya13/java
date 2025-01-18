import java.util.Scanner;

public class LargestAndSecondLargestDigits {

    public static void main(String[] args) {
        // Create a input object t
        Scanner  input = new Scanner(System.in);

        // Define the maximum number of digits to store
        int maxDigits = 10;

        // Create an array to store digits
        int[] digits = new int[maxDigits];

        // Take input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initialize the index to store digits in the array
        int index = 0;

        // Loop to extract digits from the number and store them in the array
        while (number != 0) {
            // If the index reaches the maximum size of the array, resize the array
            if (index == maxDigits) {
                maxDigits += 10;  // Increase the size by 10
                int[] temp = new int[maxDigits];  // Create a new array with the new size
                System.arraycopy(digits, 0, temp, 0, digits.length);  // Copy old digits into temp array
                digits = temp;  // Assign temp to digits, so now it can store more elements
            }

            digits[index] = number % 10;  // Get the last digit
            number /= 10;                  // Remove the last digit from the number
            index++;                       // Increment the index
        }

        // Find the largest and second largest digits
        int largest = -1;
        int secondLargest = -1;

        // Loop through the array to find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Output the largest and second largest digits
        if (largest == -1) {
            System.out.println("No digits found.");
        } else {
            System.out.println("The largest digit is: " + largest);
            if (secondLargest == -1) {
                System.out.println("There is no second largest digit.");
            } else {
                System.out.println("The second largest digit is: " + secondLargest);
            }
        }

        // Close the input
        input.close();
    }
}
