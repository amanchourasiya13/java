import java.util.Scanner;

public class NumberChecker1{

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        int digitCount = countDigits(number);
        int[] digits = new int[digitCount];
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find the sum of the digits of a number using the digits array
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number using the digits array
    public static double sumOfSquaresOfDigits(int[] digits) {
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int[] digits, int originalNumber) {
        int sum = sumOfDigits(digits);
        return originalNumber % sum == 0;
    }

    // Method to find the frequency of each digit in the number using a 2D array
    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];  // Frequency for digits 0-9
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;  // Store the digit in the first column
            frequency[i][1] = 0;   // Initialize the frequency to 0
        }

        for (int digit : digits) {
            frequency[digit][1]++;  // Increment the frequency for the digit
        }
        return frequency;
    }

    public static void main(String[] args) {
      // create an input object
        Scanner input = new Scanner(System.in);

        // Get the number from user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Store the digits in the array
        int[] digits = storeDigits(number);

        // Find and display the count of digits
        System.out.println("Count of digits: " + countDigits(number));

        // Find and display the sum of digits
        System.out.println("Sum of digits: " + sumOfDigits(digits));

        // Find and display the sum of squares of digits
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));

        // Check and display if the number is a Harshad number
        if (isHarshadNumber(digits, number)) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is not a Harshad number.");
        }

        // Find and display the frequency of each digit
        int[][] frequency = digitFrequency(digits);
        System.out.println("Digit frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] + " appears " + frequency[i][1] + " time(s).");
            }
        }

         // close the input
        input.close();
    }
}
