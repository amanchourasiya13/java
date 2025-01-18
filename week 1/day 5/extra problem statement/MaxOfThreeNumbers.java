import java.util.Scanner;

public class MaxOfThreeNumbers {

    // Function to take input from the user using a for loop
    public static int[] takeInput() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        // Using a for loop to take three integer inputs from the user
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        return numbers;
    }

    // Function to calculate the maximum of three numbers
    public static int findMaximum(int[] numbers) {
        int max = numbers[0]; // Assume the first number is the maximum initially

        // Compare each number to find the maximum
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        // Taking input from the user
        int[] numbers = takeInput();

        // Calculating the maximum of the three numbers
        int max = findMaximum(numbers);

        // Displaying the result
        System.out.println("The maximum of the three numbers is: " + max);
    }
}
