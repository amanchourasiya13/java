import java.util.Scanner;

public class PrimeNumberChecker {

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        // Edge case for numbers less than 2
        if (number <= 1) {
            return false; // 0 and 1 are not prime numbers
        }

        // Check divisibility from 2 to sqrt(number)
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If divisible, not a prime number
            }
        }

        return true; // If no divisors were found, it's a prime number
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is prime and display the result
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }
}
