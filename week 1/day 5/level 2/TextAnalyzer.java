import java.util.Scanner;

public class TextAnalyzer{

    // Method to split the text into words
    public static String[] splitTextIntoWords(String text) {
        // Split the string by spaces manually using charAt()
        StringBuilder word = new StringBuilder();
        StringBuilder words = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                words.append(word).append(" "); // Add word to the result
                word.setLength(0); // Reset for next word
            } else {
                word.append(ch); // Build the word
            }
        }
        
        // Add last word if any
        if (word.length() > 0) {
            words.append(word);
        }
        
        return words.toString().split(" "); // Return words in an array
    }

    // Method to calculate the length of a string without using length()
    public static int getStringLength(String str) {
        int length = 0;
        for (int i = 0; i < str.length(); i++) {
            length++; // Count each character
        }
        return length;
    }

    // Method to get words and their lengths in a 2D array
    public static String[][] getWordLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];
            wordLengths[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return wordLengths;
    }

    // Method to find shortest and longest words
    public static int[] findShortestAndLongestWords(String[][] wordLengths) {
        int shortestIndex = 0;
        int longestIndex = 0;
        int shortestLength = Integer.MAX_VALUE;
        int longestLength = Integer.MIN_VALUE;

        for (int i = 0; i < wordLengths.length; i++) {
            int wordLength = Integer.parseInt(wordLengths[i][1]);
            if (wordLength < shortestLength) {
                shortestLength = wordLength;
                shortestIndex = i;
            }
            if (wordLength > longestLength) {
                longestLength = wordLength;
                longestIndex = i;
            }
        }

        return new int[] { shortestIndex, longestIndex };
    }

    // Method to display words and lengths
    public static void displayWordLengths(String[][] wordLengths) {
        System.out.println("Word\t\tLength");
        for (String[] wordLength : wordLengths) {
            System.out.println(wordLength[0] + "\t\t" + wordLength[1]);
        }
    }

    public static void main(String[] args) {
        // Scanner for user input
        Scanner input = new Scanner(System.in);

        // Input string
        System.out.print("Enter a text: ");
        String text = input.nextLine();

        // Split the text into words
        String[] words = splitTextIntoWords(text);

        // Get word lengths
        String[][] wordLengths = getWordLengths(words);

        // Display the words and their lengths
        displayWordLengths(wordLengths);

        // Find the shortest and longest words
        int[] shortestAndLongest = findShortestAndLongestWords(wordLengths);

        // Display the shortest and longest word
        System.out.println("\nShortest word: " + wordLengths[shortestAndLongest[0]][0]);
        System.out.println("Longest word: " + wordLengths[shortestAndLongest[1]][0]);

        // Close the input
        input.close();
    }
}
