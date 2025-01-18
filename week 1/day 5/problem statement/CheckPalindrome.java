import java.util.Scanner;

public class CheckPalindrome{

     public static boolean isPalindrome(String str) {
     int left = 0;
     int right = str.length() - 1;
     while (left < right) {
     if (str.charAt(left) != str.charAt(right)) {
     return false;
      }
     left++;
     right--;
     }
   return true;
         }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter a String: ");
        String str = input.nextLine();

if(isPalindrome(str)){
System.out.print("String is palindrome");
                  }
else 
System.out.print("String is not palindrome");
  }
}