import java.util.Scanner;

public class DistanceYardMiles {
public static void main(String[] args) {

        // Create a input object to take input from the user
        Scanner input = new Scanner(System.in);

        //   user to eter distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Convert feet to yards
        double distanceInYards = distanceInFeet / 3;

        // Convert feet to miles
        double distanceInMiles = distanceInFeet / 5280;

        // display the result
        System.out.println("The distance is: ");
        System.out.println(distanceInFeet + " feet is equal to " + distanceInYards + " yards.");
        System.out.println(distanceInFeet + " feet is equal to " + distanceInMiles + " miles.");

        // Close the input
        input.close();
    }
}
