import java.util.Scanner;

public class SubString {

    // Method to compare two strings using charAt() method

   public static String StringUsingCharAt(String str1,int start,int end) {
    String result="";
        // Compare each character using charAt() method
        for (int i = start; i <=end; i++) {
           result +=  str1.charAt(i);
        }

        return result; // Return true if all characters match
    } 

public static String  StringUsingSubString(String str1,int start,int end){
  String  substr= str1.substring(start,end); //indexing start from 0 ,if you give 5 so it return substring from 0 to 4 
            return substr;
}

    public static void main(String[] args) {
        // Create input object to take user input
        Scanner input = new Scanner(System.in);

        // Take input for two strings
        System.out.print("Enter the  string: ");
        String str1 = input.next();
        str1= str1.trim();

        System.out.print("Enter the substring start index: ");
        int start = input.nextInt();


        System.out.print("Enter the substring end index: ");
        int end = input.nextInt();

System.out.println("Sub String using charAt(i): "+ StringUsingCharAt(str1,start,end));
System.out.println("Sub String using subString(start,end) : "+StringUsingSubString(str1,start,end));

if(StringUsingCharAt(str1,start,end).equals(StringUsingSubString(str1,start,end))){
System.out.println("Both method are equal");
}
else{
System.out.println("both method not same");
   }
         input.close(); // Close the input
    }
}
