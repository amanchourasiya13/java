import java.util.Scanner;

public class TextSplitter{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();

        // Split using the custom method
        String[] wordsByCustomMethod = splitTextCustom(inputText);
        
        // Split using the built-in split method
        String[] wordsByBuiltInMethod = inputText.split("\\s+");

        // Print results
        printWords("Words from custom method:", wordsByCustomMethod);
        printWords("Words from built-in split method:", wordsByBuiltInMethod);

        // Compare and print result
        System.out.println("\nAre the two methods' results the same? " + compareArrays(wordsByCustomMethod, wordsByBuiltInMethod));
    }

    // Method to split the text into words without using split()
    public static String[] splitTextCustom(String text) {
        String[] words = text.trim().split("\\s+");
        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    // Method to print words in an array
    public static void printWords(String header, String[] words) {
        System.out.println(header);
        for (String word : words) {
            System.out.println(word);
        }
    }
}
