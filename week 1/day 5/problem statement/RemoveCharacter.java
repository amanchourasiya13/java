public class RemoveCharacter{
    public static void main(String[] args) {
        // Example input string and character to remove
        String input = "Hello World";
        char charToRemove = 'l';
        
        // Call the method to remove the character
        String modifiedString = removeCharacter(input, charToRemove);
        
        // Output the result
        System.out.println("Modified String: " + modifiedString);
    }
    
    public static String removeCharacter(String str, char charToRemove) {
        // Use StringBuilder to build the modified string
        StringBuilder result = new StringBuilder();
        
        // Iterate over the string and append characters that are not the character to remove
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != charToRemove) {
                result.append(str.charAt(i));
            }
        }
        
        // Return the modified string
        return result.toString();
    }
}
