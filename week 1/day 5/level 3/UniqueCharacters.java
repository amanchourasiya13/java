import java.util.Scanner;

public class UniqueCharacters{

    // Method to find the length of the string without using the length() method
    public static int getStringLength(String text) {
        int length = 0;
        // Iterate through the string until the null character is encountered
        while (true) {
            try {
                text.charAt(length); // Try to access the character at the current index
                length++; // If no exception occurs, increment the length
            } catch (StringIndexOutOfBoundsException e) {
                break; // Exit loop when end of string is reached
            }
        }
        return length; // Return the length of the string
    }

    // Method to find unique characters using charAt() method and return them as a 1D array
    public static char[] findUniqueCharacters(String text) {
        // Get the length of the text
        int length = getStringLength(text);

        // Create an array to store unique characters
        char[] result = new char[length];
        int resultIndex = 0; // Variable to track where to store unique characters in the result array

        // Loop through each character in the string
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Compare the current character with the previous ones using a nested loop
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break; // If the character is found in the previous part of the string, it's not unique
                }
            }

            // If the character is unique, store it in the result array
            if (isUnique) {
                result[resultIndex] = currentChar;
                resultIndex++;
            }
        }

        // Create a new array to store only the unique characters (without empty slots)
        char[] uniqueChars = new char[resultIndex];
        for (int i = 0; i < resultIndex; i++) {
            uniqueChars[i] = result[i];
        }

        return uniqueChars;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the string
        System.out.println("Enter a string:");
        String text = input.nextLine();

        // Find unique characters
        char[] uniqueChars = findUniqueCharacters(text);

        // Display the unique characters
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        
        input.close(); // Close the scanner
    }
}
