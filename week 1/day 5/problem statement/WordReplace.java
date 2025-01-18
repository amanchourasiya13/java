public class WordReplace{

    public static String replaceWord(String sentence, String target, String replacement) {
        // To store the result after replacement
        StringBuilder result = new StringBuilder();

        // Index to iterate through the sentence
        int i = 0;
        while (i < sentence.length()) {
            // Check if the target word matches at the current position
            if (i + target.length() <= sentence.length() && sentence.substring(i, i + target.length()).equals(target)) {
                // If we find a match, append the replacement word
                result.append(replacement);
                // Skip past the target word in the sentence
                i += target.length();
            } else {
                // Otherwise, append the current character from the sentence
                result.append(sentence.charAt(i));
                i++;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Example usage of the replaceWord method
        String sentence = "The quick brown fox jumps over the lazy fox.";
        String target = "fox";
        String replacement = "cat";

        // Replace the word and print the result
        String updatedSentence = replaceWord(sentence, target, replacement);
        System.out.println("Original Sentence: " + sentence);
        System.out.println("Updated Sentence: " + updatedSentence);
    }
}
