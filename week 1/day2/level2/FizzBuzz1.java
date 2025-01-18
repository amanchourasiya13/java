import java.util.Scanner;

public class FizzBuzz1 {
    public static void main(String[] args) {
     // Create a input object for user input
        Scanner input = new Scanner(System.in);

     // Get user input positive integer
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

     // Check if the input is a positive integer
        if (number > 0) {
     // Loop from 0 to the given number
           for (int i = 0; i <= number; i++) {
      // Check conditions for Fizz, Buzz, and FizzBuzz
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

        // display the result
        input.close();
    }
}
