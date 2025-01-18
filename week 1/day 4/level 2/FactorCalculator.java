import java.util.Scanner;

public class FactorCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Take input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Find the factors of the number
        int[] factors = findFactors(number);
        
        // Display the factors
        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        
        // Find and display the sum of the factors
        int sum = findSum(factors);
        System.out.println("Sum of factors: " + sum);
        
        // Find and display the sum of squares of the factors
        double sumOfSquares = findSumOfSquares(factors);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
        
        // Find and display the product of the factors
        long product = findProduct(factors);
        System.out.println("Product of factors: " + product);
    }

    // Method to find the factors and return them in an array
    public static int[] findFactors(int number) {
        // First loop to count the number of factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Create an array to store the factors
        int[] factors = new int[count];
        int index = 0;

        // Second loop to actually store the factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // Method to find the sum of the factors
    public static int findSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the sum of squares of the factors
    public static double findSumOfSquares(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    // Method to find the product of the factors
    public static long findProduct(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
}
