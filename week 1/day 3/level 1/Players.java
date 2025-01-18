import java.util.Scanner;

public class Players{
    public static void main(String[] args) {
        // Create a input object 
           Scanner input = new Scanner(System.in);

        // Define an array 
           double[] height = new double[11];
             double sum=0;

        // Loop the array and take input for players height
            for (int i = 0; i < height.length; i++) {
            System.out.print("Enter the height of player " + (i + 1) + ": ");
            height[i] = input.nextDouble(); // Get the age from user input
              
         // initialize double sum and  sum to zero
           
             sum+=height[i];
               }
            double mean= sum/11;
System.out.println("The mean height of fotball team is: "+ mean);
                               

    }
}
