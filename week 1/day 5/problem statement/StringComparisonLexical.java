import java.util.Scanner;

public class StringComparisonLexical{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Compare the strings lexicographically
        int result = compareStringsLexicographically(str1, str2);

        // Output the result
        if (result < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
        } else if (result > 0) {
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order");
        } else {
            System.out.println("Both strings are identical");
        }

        scanner.close();
    }

    // Method to compare two strings lexicographically
    public static int compareStringsLexicographically(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());

        // Compare each character one by one
        for (int i = 0; i < minLength; i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            // Compare characters
            if (c1 < c2) {
                return -1; // str1 is lexicographically smaller
            } else if (c1 > c2) {
                return 1; // str1 is lexicographically larger
            }
        }

        // If one string is a prefix of the other, the shorter string comes first
        if (str1.length() < str2.length()) {
            return -1;
        } else if (str1.length() > str2.length()) {
            return 1;
        }

        // Strings are equal
        return 0;
    }
}
