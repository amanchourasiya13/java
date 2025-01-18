import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        // Create a input object for user input
        Scanner input = new Scanner(System.in);

        // take user inputfor number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // create variable and assign value zero
        int sum = 0;

        // Step 1: Run a for loop to find divisors of the number
                   for (int i = 1; i < number; i++) {
        // Step 2: Check if i is a divisor of the number
                   if (number % i == 0) {
        // Step 3: Add divisor to sum
                sum += i;
            }
        }

        // Step 4: Check if the sum of divisors is greater than the number
                  if (sum > number) {
                  System.out.println(number + " is an Abundant Number.");
                  } else {
                  System.out.println(number + " is not an Abundant Number.");
                    }
        //  close the input
        input.close();
    }
}
