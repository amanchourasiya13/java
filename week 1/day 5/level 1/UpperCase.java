import java.util.Scanner;
public class UpperCase{

public static String convertToUpperCaseUsingCharAt(String str) {
    String result = "";  // Initialize an empty string to store the result
    
    // Loop
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (ch >= 'a' && ch <= 'z') {
            // Convert to uppercase using ASCII value difference
            ch = (char)(ch-32);
        }
        result += ch;  // Append the character to the result string
    }
    
    return result;
}

public static String convertToUpperCaseUsingBuiltIn(String str) {
    // Use the built-in toUpperCase() method to convert the string to uppercase
    return str.toUpperCase();
}
public static void main(String[]args){

Scanner input=new Scanner(System.in);
System.out.print("enter any string: ");
String str=input.nextLine();

String upperUser=convertToUpperCaseUsingCharAt(str);
String upperBuilt=convertToUpperCaseUsingBuiltIn(str);

System.out.println("user method: "+ upperUser);
System.out.println("built in method: "+upperBuilt);

        // Compare the two results
        if (upperUser.equals(upperBuilt)) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("The results are different.");
        }
//if(upperUser.equals(upperBuilt)){System.out.println("both same"); }

    }
}