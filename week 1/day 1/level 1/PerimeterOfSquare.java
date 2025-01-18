import java.util.Scanner;
public class PerimeterOfSquare {
public static void main(String[] args) {

        // Create input object to read user input
        Scanner input = new Scanner(System.in);
      
        //  user to enter square 
        System.out.print("Enter perimeter: ");
        double perimeter = input.nextDouble();

        // Calculate the side length of the square
        double side = perimeter / 4;
     
        // Display the result
       System.out.println("The length of the side is "+side +" whose perimeter is "+perimeter);

        // Close the input
        input.close();
    }
}
