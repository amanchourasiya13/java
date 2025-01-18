import java.util.Scanner;
public class Weight {

    public static void main(String[] args) {
        // Create a input object for user input
        Scanner input  = new Scanner(System.in);

        // take input from user to weight
        System.out.print("Enter Weight in pound: ");
        double weightInPound =input.nextDouble();

        // convert weight in pound to kilograms 1pound=2.2kg
        double kg= weightInPound*2.2;

        //display the result
        System.out.println("The weight of person in pound is:"+ weightInPound+" and in kg is "+ kg);

        // Close the input
        input.close();
    }
}
