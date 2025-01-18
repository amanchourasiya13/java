import java.util.Scanner;

public class StringComparision {

    // Method to compare two strings using charAt() method

    public static boolean StringUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // If lengths are different, return false
        }

        // Compare each character using charAt() method
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // Return false if characters don't match
            }
        }

        return true; // Return true if all characters match
    }

public static boolean  StringUsingIsEqual(String str1,String str2){
 if(str1.equals(str2)){
   return true;   
      }
   else 
      return false;
}

    public static void main(String[] args) {
        // Create input object to take user input
        Scanner input = new Scanner(System.in);

        // Take input for two strings
        System.out.print("Enter the first string: ");
        String str1 = input.next();
        System.out.print("Enter the second string: ");
        String str2 = input.next();


        // Compare using
      //  boolean resultUsingCharAt =StringUsingCharAt(str1, str2);
      //  boolean resultUsingEqual = StringUsingIsEqual(str1, str2);
        // Display results

        System.out.println("Comparison using charAt() method: " +StringUsingCharAt(str1, str2));
        System.out.println("Comparison using equals() method: " + StringUsingIsEqual(str1, str2));

        // Check if both methods yield the same result
    /*   if (resultUsingCharAt == resultUsingEqual) {
            System.out.println("Both methods gave the same result.");
        } else {
            System.out.println("The methods gave different results.");
        }
 */

   if (StringUsingCharAt(str1,str2) == StringUsingIsEqual(str1,str2)) {
            System.out.println("Both methods gave the same result.");
        } else {
            System.out.println("The methods gave different results.");
        }

         input.close(); // Close the input
    }
}
