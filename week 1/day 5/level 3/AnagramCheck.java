import java.util.Scanner;

public class AnagramCheck{

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Remove spaces and convert to lower case to handle case insensitivity and ignore spaces
        text1 = text1.replaceAll("\\s", "").toLowerCase();
        text2 = text2.replaceAll("\\s", "").toLowerCase();

        // Check if lengths are not equal, if they are not, they cannot be anagrams
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create an array to store the frequency of characters for both texts
        int[] frequency1 = new int[256]; // Array to store frequency for text1 (ASCII range 0-255)
        int[] frequency2 = new int[256]; // Array to store frequency for text2 (ASCII range 0-255)

        // Find the frequency of characters in text1
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
        }

        // Find the frequency of characters in text2
        for (int i = 0; i < text2.length(); i++) {
            frequency2[text2.charAt(i)]++;
        }

        // Compare the frequency arrays
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false; // If frequencies don't match, they are not anagrams
            }
        }

        return true; // If all frequencies match, the texts are anagrams
    }

    public static void main(String[] args) {
        // Create scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to input the first text
        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine();

        // Prompt user to input the second text
        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine();

        // Check if the texts are anagrams
        boolean result = areAnagrams(text1, text2);

        // Display the result
        if (result) {
            System.out.println("The two texts are anagrams.");
        } else {
            System.out.println("The two texts are not anagrams.");
        }

        // Close the scanner
        scanner.close();
    }
}
