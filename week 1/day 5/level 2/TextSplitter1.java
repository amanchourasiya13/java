import java.util.Scanner;

public class TextSplitter1{

    // Method to split the text into words using charAt()
    public static String[] splitTextIntoWords(String text) {
        int wordCount = 0;
        StringBuilder word = new StringBuilder();
        
        // First pass to count the words
        for (int i = 0; i < text.length(); i++) {
            if (Character.isWhitespace(text.charAt(i))) {
                if (word.length() > 0) {
                    wordCount++;
                    word.setLength(0); // reset word
                }
            } else {
                word.append(text.charAt(i));
            }
        }
        
        // If the last word exists
        if (word.length() > 0) {
            wordCount++;
        }

        // Second pass to collect the words
        String[] words = new String[wordCount];
        int index = 0;
        word.setLength(0); // reset word
        
        for (int i = 0; i < text.length(); i++) {
            if (Character.isWhitespace(text.charAt(i))) {
                if (word.length() > 0) {
                    words[index++] = word.toString();
                    word.setLength(0); // reset word
                }
            } else {
                word.append(text.charAt(i));
            }
        }
        
        // For the last word
        if (word.length() > 0) {
            words[index] = word.toString();
        }
        
        return words;
    }

    // Method to find the length of a string without using length() method
    public static int findLength(String word) {
        int length = 0;
        for (int i = 0; i < word.length(); i++) {
            length++;
        }
        return length;
    }

    // Method to create a 2D array of words and their lengths
    public static String[][] createWordLengthArray(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];
        
        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i];
            wordLengthArray[i][1] = String.valueOf(findLength(words[i])); // Convert length to String
        }
        
        return wordLengthArray;
    }

    // Main function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user input
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();
        
        // Split the text into words
        String[] words = splitTextIntoWords(text);
        
        // Get the 2D array of word and its corresponding length
        String[][] wordLengthArray = createWordLengthArray(words);
        
        // Display the result in a tabular format
        System.out.println("Word\tLength");
        for (int i = 0; i < wordLengthArray.length; i++) {
            // Convert length from String to Integer and display
            System.out.println(wordLengthArray[i][0] + "\t" + Integer.parseInt(wordLengthArray[i][1]));
        }
        
        scanner.close();
    }
}
