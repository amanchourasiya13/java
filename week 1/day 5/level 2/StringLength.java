import java.util.Scanner;

public class StringLength{

    // Method to find the length of a string without using length() method
    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                // Try accessing the character at the current index
                str.charAt(count);  // This will throw exception when index is out of range
                count++;  // Increment the count if charAt() is successful
            }
        } catch (StringIndexOutOfBoundsException e) {
            // When exception is thrown, it means we've counted all characters
            return count;  // Return the count which is the length of the string
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input using Scanner next()
        System.out.print("Enter a string: ");
        String str = input.next();  // Use next() to read a single word (no spaces)

        // Call the user-defined method to find the length of the string
        int customLength = getStringLength(str);

        // Display the results using the built-in length() method and custom method
        System.out.println("Length of the string using custom method: " + customLength);
        System.out.println("Length of the string using built-in length() method: " + str.length());
    }
}
