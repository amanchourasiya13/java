import java.util.Scanner;
public class TwoNumber {

    public static void main(String[] args) {
        // Create a input object for user input
        Scanner input  = new Scanner(System.in);

        // user to input two numbers
        System.out.print("Enter first number: ");
        int numberOne = input.nextInt();

        System.out.print("Enter second number: ");
        int numberTwo = input.nextInt();

        // Perform the  division / operator for quotient
        int  quotient = numberOne / numberTwo;

        // Perform the moduli % operator for reminder
        int moduli = numberOne % numberTwo;
       
        // display the results
        System.out.println("The Quotient is " + quotient + " and Remainder is "+ moduli + " of two number " + numberOne + " and "+ numberTwo);
        // Close the input
        input.close();
    }
}
