import java.util.Scanner;

public class NumberChecker4{

    // Method to find the factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;
        
        // Count the factors first
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        
        // Create an array to store the factors
        int[] factors = new int[count];
        int index = 0;
        
        // Store the factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        
        return factors;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 1];  // The greatest factor is the last element in the array
    }

    // Method to find the sum of the factors using the factors array
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using the factors array
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cubes of the factors using the factors array
    public static double productOfCubesOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);  // Using Math.pow() to cube the factor
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sumOfProperDivisors = sumOfFactors(factors) - number; // Exclude the number itself
        return sumOfProperDivisors == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sumOfProperDivisors = sumOfFactors(factors) - number; // Exclude the number itself
        return sumOfProperDivisors > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sumOfProperDivisors = sumOfFactors(factors) - number; // Exclude the number itself
        return sumOfProperDivisors < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int temp = number;
        int sumOfFactorials = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sumOfFactorials += factorial(digit);
            temp /= 10;
        }
        return sumOfFactorials == number;
    }

    // Helper method to calculate the factorial of a number
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
     // create an input object
        Scanner input = new Scanner(System.in);

        // Get the number from user input
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

        // Find and display the greatest factor
        System.out.println("Greatest factor: " + greatestFactor(factors));

        // Find and display the sum of the factors
        System.out.println("Sum of factors: " + sumOfFactors(factors));

        // Find and display the product of the factors
        System.out.println("Product of factors: " + productOfFactors(factors));

        // Find and display the product of the cubes of the factors
        System.out.println("Product of cubes of factors: " + productOfCubesOfFactors(factors));

        // Check and display if the number is a perfect number
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }

        // Check and display if the number is an abundant number
        if (isAbundantNumber(number)) {
            System.out.println(number + " is an abundant number.");
        } else {
            System.out.println(number + " is not an abundant number.");
        }

        // Check and display if the number is a deficient number
        if (isDeficientNumber(number)) {
            System.out.println(number + " is a deficient number.");
        } else {
            System.out.println(number + " is not a deficient number.");
        }

        // Check and display if the number is a strong number
        if (isStrongNumber(number)) {
            System.out.println(number + " is a strong number.");
        } else {
            System.out.println(number + " is not a strong number.");
        }

        // close the input
        input.close();
    }
}
