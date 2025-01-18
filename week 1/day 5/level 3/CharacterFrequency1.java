import java.util.Scanner;

public class CharacterFrequency1{

    // Method to find the unique characters in the string
    public static char[] uniqueCharacters(String text) {
        // Create an array to store the frequency of characters
        int[] frequency = new int[256];  // 256 for all ASCII characters
        int length = text.length();
        
        // Loop to populate frequency of each character
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Create a list of unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        // Array to store unique characters
        char[] uniqueChars = new char[uniqueCount];
        int index = 0;

        // Populate the unique characters array
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueChars[index++] = (char) i;
            }
        }

        return uniqueChars;
    }

    // Method to find the frequency of characters using unique characters and return as 2D array
    public static String[][] characterFrequency(String text) {
        // Find the unique characters
        char[] uniqueChars = uniqueCharacters(text);

        // Create an array to store characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];

        // Loop through unique characters and store their frequency
        for (int i = 0; i < uniqueChars.length; i++) {
            char currentChar = uniqueChars[i];
            int frequency = 0;

            // Count frequency of the character in the string
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == currentChar) {
                    frequency++;
                }
            }

            // Store the character and its frequency
            result[i][0] = String.valueOf(currentChar);
            result[i][1] = String.valueOf(frequency);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the string
        System.out.println("Enter a string:");
        String text = input.nextLine();

        // Find the frequency of characters
        String[][] frequencies = characterFrequency(text);

        // Display the result
        System.out.println("Character frequencies:");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println("Character: " + frequencies[i][0] + " | Frequency: " + frequencies[i][1]);
        }

        input.close(); // Close the scanner
    }
}
