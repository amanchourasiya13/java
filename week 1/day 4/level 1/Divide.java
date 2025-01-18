import java.util.Scanner;

public class Divide{
    
    // Method to find
   public static int[] findRemainderAndQuotient(int number, int divisor){
        int smallest, largest;
        
        // Find 
          int divide =number/divisor;
          int modulo= number%divisor;

        // Return  remainder and quotient in array 
        return new int[] {divide,modulo};
    }

    public static void main(String[] args) {
        // Create scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Taking input for number and divisor
        System.out.print("Enter number: ");
        int number = input.nextInt();
        
        System.out.print("Enter divisor: ");
        int divisor = input.nextInt();
                
        // Call method to find remainder and quotient
        int[] result = findRemainderAndQuotient(number,divisor);

        
        // Display the results
        System.out.println("quotient: " + result[0]);
        System.out.println("remainder: " + result[1]);
        
        // Close input
        input.close();
    }
}
