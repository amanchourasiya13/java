import java.util.Scanner;

public class CharacterFrequency{

    // Method to find the frequency of characters in a string using charAt() method
    public static String[][] findCharacterFrequency(String text) {
        // Create an array to store the frequency of characters (ASCII values)
        int[] frequency = new int[256];  // 256 for all ASCII characters

        // Loop through the text and populate the frequency array
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++; // Increment the frequency of the character
        }

        // Create an array to store the characters and their frequencies
        String[][] result = new String[256][2];  // 256 rows (for each character), 2 columns (character and frequency)
        int index = 0;

        // Loop through the frequency array and store characters with non-zero frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i);  // Store the character
                result[index][1] = String.valueOf(frequency[i]); // Store the frequency
                index++;
            }
        }

        // Resize the result array to remove empty rows
        String[][] resizedResult = new String[index][2];
        for (int i = 0; i < index; i++) {
            resizedResult[i][0] = result[i][0];
            resizedResult[i][1] = result[i][1];
        }

        return resizedResult;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the string
        System.out.println("Enter a string:");
        String text = input.nextLine();

        // Find the frequency of characters
        String[][] frequencies = findCharacterFrequency(text);

        // Display the result
        System.out.println("Character frequencies:");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println("Character: " + frequencies[i][0] + " | Frequency: " + frequencies[i][1]);
        }

        input.close(); // Close the scanner
    }
}
