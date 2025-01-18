import java.util.Scanner;

public class StringTrimmingAndComparison {

    // Method to trim leading and trailing spaces using charAt()
    public static int[] trimSpacesUsingCharAt(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Find the first non-space character
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Find the last non-space character
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        // Return the start and end indices
        return new int[] { start, end };
    }

    // Method to create a substring using charAt()
    public static String createSubstringUsingCharAt(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i <= end; i++) {
            substring.append(str.charAt(i));
        }
        return substring.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // input object to take user input
        Scanner input = new Scanner(System.in);

        // Input strings
        System.out.print("Enter a string with spaces: ");
        String inputString = input.nextLine();

        // Trim leading and trailing spaces using charAt() method
        int[] trimmedIndices = trimSpacesUsingCharAt(inputString);
        String trimmedStringUsingCharAt = createSubstringUsingCharAt(inputString, trimmedIndices[0], trimmedIndices[1]);

        // Trim using the built-in trim() method
        String trimmedStringUsingTrim = inputString.trim();

        // Display both results
        System.out.println("Trimmed using charAt(): '" + trimmedStringUsingCharAt + "'");
        System.out.println("Trimmed using built-in trim(): '" + trimmedStringUsingTrim + "'");

        // Compare the two results
        boolean areEqual = compareStringsUsingCharAt(trimmedStringUsingCharAt, trimmedStringUsingTrim);
        System.out.println("Are the two strings equal after trimming? " + areEqual);

        // Close the input
        input.close();
    }
}
