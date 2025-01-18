import java.util.Scanner;
public class Swap {

    public static void main(String[] args) {
        // Create a input object for user input
        Scanner input  = new Scanner(System.in);

        // user to input two numbers
        System.out.print("Enter first number: ");
        int numberOne = input.nextInt();

        System.out.print("Enter second number: ");
        int numberTwo = input.nextInt();

        // Swap the number
         numberOne=numberOne+numberTwo;     //assume a=2,b=4; a=1+2=3;
         numberTwo=numberOne-numberTwo;     // b=3-2=1;
         numberOne=numberOne-numberTwo;      // a=3-1=2;

        // display the results
        System.out.println("The Swapped numbers are "+numberOne+ " and "+numberTwo);

        // Close the input
        input.close();
    }
}
