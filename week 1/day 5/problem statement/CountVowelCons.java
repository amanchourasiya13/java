import java.util.Scanner;

public class CountVowelCons{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter a String: ");
        String str = input.nextLine();

        int vowel = 0;
        int constCount = 0; // create 'constCount'  ,dont create'const' it  is a reserved keyword

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') { // Added uppercase vowels
                    vowel++;
                } else {
                    constCount++; 
                }
            }
        }
        System.out.println("Total vowels: " + vowel + " Total consonants: " + constCount);
    }
}
