import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {

        // Create a input  object to take user input
        Scanner input = new Scanner(System.in);

        //  user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // 
            for (int i = 1; i<number; i++) {
                // Check if i is a multiple of the input number
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        // Close the input
        input.close();
    }
}