import java.util.Scanner;
public class Athelete {

    public static void main(String[] args) {
        // Create a input object for user input
        Scanner input  = new Scanner(System.in);

        // user to input side1,side2,side3
        System.out.print("Enter side1 in meters : ");
        double sideOne = input.nextDouble();

        System.out.print("Enter side2 in meters: ");
        double sideTwo = input.nextDouble();

        System.out.print("Enter side3 in meters : ");
        double sideThree = input.nextDouble();

/* The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter */

        //calculate perimeter of triangle
        double perimeter= sideOne+sideTwo+sideThree;

         //calculate distance
        double distance=5000;   //5km =5000 meters
       
        double rounds=distance/perimeter;

        // display the results
   System.out.println(" The total number of rounds the athlete will run is "+ rounds+" to complete 5 km");

        // Close the input
        input.close();
    }
}
