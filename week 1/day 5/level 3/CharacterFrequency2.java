import java.util.Scanner;

public class CharacterFrequency2{
    
    // Method to find the frequency of characters in a string
    public static String[] findCharacterFrequency(String text) {
        // Convert the string to a char array
        char[] chars = text.toCharArray();
        
        // Create an array to store frequency of each character
        int[] frequency = new int[chars.length];
        
        // Create a 1D array to store the result (characters and their frequencies)
        String[] result = new String[chars.length];
        
        // Outer loop to traverse each character in the string
        for (int i = 0; i < chars.length; i++) {
            // Skip if this character is already counted (frequency is zero)
            if (frequency[i] == 0) {
                frequency[i] = 1;  // Initialize frequency of the character to 1
                
                // Inner loop to check for duplicate characters
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        frequency[i]++;  // Increment the frequency
                        frequency[j] = 0;  // Set the duplicate character's frequency to 0
                    }
                }
                
                // Store the character and its frequency in the result array
                result[i] = chars[i] + ": " + frequency[i];
            }
        }
        
        // Return the result array
        return result;
    }
    
    public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to input a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Call the method to find character frequencies
        String[] frequencies = findCharacterFrequency(inputString);
        
        // Display the frequencies
        System.out.println("\nCharacter frequencies in the string:");
        for (String frequency : frequencies) {
            if (frequency != null) {
                System.out.println(frequency);
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
