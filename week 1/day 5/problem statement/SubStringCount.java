import java.util.Scanner;
public class SubstringCount{
    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
        // Input string and substring
         System.out.print("Enter the string: ");
        String str =input.next();

          System.out.print("Enter the Sub string: ");
          String substring =input.nextLine();
        
        // Call the countSubstringOccurrences method
        int count = countSubstringOccurrences(str,substring);
        
        // Output the result
        System.out.println("The substring '" + substring + "' occurs " + count + " times.");
    }
    
    // Method to count occurene SubsString 
    public static int countSubstringOccurrences(String str, String subStr) {
        int count = 0;
       
        // Iterate through the string using a for loop
        for (int i = 0; i <= str.length() - subStr.length(); i++) {

            // Check if the substring matches at the current position
            if (str.substring(i, i + subStr.length()).equals(subStr)) {
                count++; 
            }
        }
        
        return count;
    }
}
