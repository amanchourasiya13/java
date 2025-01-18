import java.util.Scanner;

public class FirstNonRepeatingCharacter{

    // Method to find the first non-repeating character
    public static char firstNonRepeatingCharacter(String text) {
        // Create an array to store the frequency of characters (ASCII values)
        int[] frequency = new int[256];  // 256 for all ASCII characters

        // Loop through the text and populate the frequency array
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++; // Increment the frequency of the character
        }

        // Loop through the text again to find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] == 1) {
                return currentChar;  // Return the first non-repeating character
            }
        }

        return '\0';  // Return null character if there are no non-repeating characters
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the string
        System.out.println("Enter a string:");
        String text = input.nextLine();

        // Find the first non-repeating character
        char result = firstNonRepeatingCharacter(text);

        // Display the result
        if (result == '\0') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("The first non-repeating character is: " + result);
        }

        input.close(); // Close the scanner
    }
}
