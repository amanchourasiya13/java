import java.util.Scanner;

public class VowelConsonantChecker1{

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

    // Method to find vowels and consonants in a string and return the results in a 2D array
    public static String[][] findVowelsAndConsonants(String str) {
        // Array to hold the character and its type (Vowel/Consonant/Not a Letter)
        String[][] result = new String[str.length()][2];

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch); // Store the character
            result[i][1] = checkCharacterType(ch); // Store the type (Vowel/Consonant/Not a Letter)
        }

        return result;
    }

    // Method to display the 2D array of strings in a tabular format
    public static void displayResults(String[][] result) {
        System.out.println("Character\tType");
        System.out.println("----------------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }
    }

    public static void main(String[] args) {
        // input object  for user input
        Scanner input = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String inputString = input.nextLine();

        // Find vowels and consonants using the method
        String[][] results = findVowelsAndConsonants(inputString);

        // Display the results in a tabular format
        displayResults(results);

        // Close the input
        input.close();
    }
}
