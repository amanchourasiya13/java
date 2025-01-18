import java.util.Scanner;

public class VowelConsonantCounter{

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        // Convert character to lowercase if it's uppercase
        ch = Character.toLowerCase(ch);
        
        // Check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }
        // Check if the character is a consonant
        else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }
        // If it's not a letter
        else {
            return "Not a Letter";
        }
    }

    // Method to find vowels and consonants in a string and return counts in an array
    public static int[] countVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check the type of character and count vowels and consonants
            String result = checkCharacterType(ch);
            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }

        // Return the counts of vowels and consonants in an array
        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {
        // input object for user input
        Scanner input = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String inputString = input.nextLine();

        // Count vowels and consonants using the method
        int[] counts = countVowelsAndConsonants(inputString);

        // Display the results
        System.out.println("Number of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);

        // Close the scanner
        input.close();
    }
}
