//Create a program to convert distance in kilometers to miles

import java.util.Scanner;   // importing Scanner library for taking input
public class KmInMiles{
public static void main(String []args){

  // Create a input object for user input
     Scanner input = new Scanner(System.in);
System.out.print("Enter the Kilometers: ");
        double km;                             //create variable
        km=input.nextInt();                   // assign value from user input
        float miles=1.6f;                    // 1miles=1.6km 
        double distanceMiles=km*miles;

  // display the result
    System.out.println("The total miles is "+ distanceMiles+ "mile for the given "+km);

  // close the input
      input.close();
    }
}