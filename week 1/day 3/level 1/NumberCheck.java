import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        // Create a input object 
           Scanner input = new Scanner(System.in);

        // Define an array 
           int[] n = new int[5];

        // Loop the array and take input for each student's age
            for (int i = 0; i < n.length; i++) {
            System.out.print("Enter the number of student " + (i + 1) + ": ");
            n[i] = input.nextInt(); // Get the age from user input

        // Check if the age is positive or negative 
            if (n[i] < 0) {
                System.out.println("student no " +n[i] + " is Negative number.");
            } else if (n[i]>0) {
                System.out.println("student no "+n[i]+" is Positive number");
            } else {
                System.out.println("student no "+ n[i]+" is zero.");
            }
          }

        // Close the input object
            input.close();
    }
}
