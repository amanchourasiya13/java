import java.util.Scanner;

public class StringNumberFormatException{

    // Method to generate NumberFormatException
    public static void generateException(String str) {
             int number = Integer.parseInt(str);  // This line may throw an exception
        System.out.println("The number is: " + number);
    }

    // Method to demonstrate handling of NumberFormatException

    public static void handleNumberFormatException(String str) {
        try {
            // Call the method that can generate the exception
            generateException(str);
        } catch (NumberFormatException e) {
            // Handling the specific exception for invalid number format
                       System.out.println("A NumberFormatException exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input as a String
        System.out.print("Enter a number (or text that cannot be converted to a number): ");
        String str = input.nextLine();

        // First, call the method that will generate the exception
        System.out.println("\nAttempting to generate exception...");
        generateException(str);  // This will likely throw an exception if the input is invalid

        // Then call the method to handle the exception
        System.out.println("\nNow handling the exception:");
        handleNumberFormatException(str);  // Handle the exception gracefully

        input.close();
    }
}
