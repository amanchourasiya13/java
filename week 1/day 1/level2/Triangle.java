import java.util.Scanner;
public class Triangle {
   public static void main(String[] args) {
        // Create scanner object to read user input
        Scanner input = new Scanner(System.in);

        //  user to enter height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightInCm = input.nextDouble();

        System.out.print("Enter  base: ");
        double base = input.nextDouble();
        // Convert centimeters to inches (1 inch = 2.54 cm)
        double heightInInches = heightInCm / 2.54;

        // Calculate the number of feet
        int feet = (int) heightInInches / 12;

        // area of triangle in cm and inches 
        double AreaCm= 0.5*base*heightInCm;
        double AreaInch= 0.5*base*heightInInches;


        // Display the result
        System.out.println("Your height in cm is "+heightInCm +" while in feet is "+ feet +" and inches is " + heightInInches);
        System.out.println("area of triangle in square inches"+AreaInch +" and square centimeters is: "+AreaCm);

        // Close the scanner
        input.close();
    }
}

