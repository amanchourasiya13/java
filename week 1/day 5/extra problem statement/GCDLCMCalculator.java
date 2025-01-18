import java.util.Scanner;

public class GCDLCMCalculator{

    // Function to calculate GCD using the Euclidean algorithm
    public static int calculateGCD(int a, int b) {
        // Using the Euclidean algorithm to find GCD
        while (b != 0) {
            int temp = b;
            b = a % b; // Remainder of a divided by b
            a = temp; // Update a to the previous value of b
        }
        return a; // a is now the GCD
    }

    // Function to calculate LCM using the formula: LCM = (a * b) / GCD(a, b)
    public static int calculateLCM(int a, int b, int gcd) {
        return Math.abs(a * b) / gcd; // Absolute value ensures positive result
    }

    // Function to take input from the user
    public static int[] takeInput() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[2];
        
        // Prompting the user for two numbers
        System.out.print("Enter the first number: ");
        numbers[0] = scanner.nextInt();
        System.out.print("Enter the second number: ");
        numbers[1] = scanner.nextInt();
        
        return numbers;
    }

    // Function to display the result
    public static void displayResult(int gcd, int lcm) {
        System.out.println("Greatest Common Divisor (GCD): " + gcd);
        System.out.println("Least Common Multiple (LCM): " + lcm);
    }

    public static void main(String[] args) {
        // Taking input from the user
        int[] numbers = takeInput();
        
        // Calculating GCD
        int gcd = calculateGCD(numbers[0], numbers[1]);
        
        // Calculating LCM using the GCD
        int lcm = calculateLCM(numbers[0], numbers[1], gcd);
        
        // Displaying the results
        displayResult(gcd, lcm);
    }
}
