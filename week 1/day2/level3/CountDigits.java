import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        // Create a input object for user input
        Scanner input = new Scanner(System.in);

        //  take input number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        //  create variable sum and assign zero
        int count = 0;

        // Step 1: Use a loop to count the digits
                   while (number != 0) {
        // Step 2: Remove the last digit and increase count by 1
                  number = number / 10;
                  count++;
        }

        // Step 3: Display the number of digits
        System.out.println("The number of digits is: " + count);

       //close the input
        input.close();
    }
}
