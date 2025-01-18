import java.util.Scanner;

public class SmallLarge {
    
    // Method to find smallest and largest
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest, largest;
        
        // Find smallest and largest
        if (number1 <= number2 && number1 <= number3) {
            smallest = number1;
        } else if (number2 <= number1 && number2 <= number3) {
            smallest = number2;
        } else {
            smallest = number3;
        }

        if (number1 >= number2 && number1 >= number3) {
            largest = number1;
        } else if (number2 >= number1 && number2 >= number3) {
            largest = number2;
        } else {
            largest = number3;
        }

        // Return smallest and largest in an array
        return new int[] {smallest, largest};
    }

    public static void main(String[] args) {
        // Create scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Taking input for 3 numbers
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
        
        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();
        
        // Call method to find smallest and largest
        int[] result = findSmallestAndLargest(number1, number2, number3);

        
        // Display the results
        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);
        
        // Close input
        input.close();
    }
}
