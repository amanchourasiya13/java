import java.util.Scanner;
public class SimpleInterest{

    public static void main(String[] args) {
        // Create a input object for user input
        Scanner input  = new Scanner(System.in);

        // user to input  principal ,rate and time.

        System.out.print("Enter principal: ");
        int principal = input.nextInt();

        System.out.print("Enter rate: ");
        double rate = input.nextInt();

        System.out.print("Enter time: ");
        double time = input.nextInt();

        // Calculate the simple Interest Simple Interest = Principal * Rate * Time / 100
        double simpleInterest=principal * rate * time / 100;
       
        // display the results
         System.out.println("The Simple Interest is "+ simpleInterest+" for principal "+ +principal+" rate of interest "+rate +" and time "+time);

        // Close the input
        input.close();
    }
}
