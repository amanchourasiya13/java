import java.util.Scanner;

public class StringCharArray {

    // User-defined method to extract characters without using toCharArray
    public static char[] getCharactersWithoutToCharArray(String str) {
        // Creating a character array of the same length as the string
        char[] chars = new char[str.length()];

        // Loop through the string to extract each character and store it in the array
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i); // Use charAt() to get each character
        }

        return chars;
    }

    // Method to check if two arrays are equal
    public static boolean checkArray(char userDefined[], char builtIn[]) {
        if (userDefined.length == builtIn.length) {
            for (int i = 0; i < userDefined.length; i++) {
                if (userDefined[i] != builtIn[i]) {
                    return false; // Return false if characters are not equal
                }
            }
            return true; // Return true if all characters are equal
        }
        return false; // Return false if array lengths are not equal
    }

    public static void main(String[] args) {
        // Create input object to take user input
        Scanner input = new Scanner(System.in);

        // Take input for a string
        System.out.print("Enter the string: ");
        String str = input.next();
           str = str.trim();

        // Get the character arrays from both methods
        char[] userDefined = getCharactersWithoutToCharArray(str);
        char[] builtIn = str.toCharArray();

        // Display characters from both methods
        for (int i = 0; i < str.length(); i++) {
            System.out.print("user defined: " + userDefined[i]+ " ");
            System.out.println("built in: " + builtIn[i]);
        }

        // Compare the results and display the result
        if (checkArray(userDefined, builtIn)) {
            System.out.println("Both methods are equal.");
        } else {
            System.out.println("Both methods are not the same.");
        }

        input.close(); // Close the input scanner
    }
}
