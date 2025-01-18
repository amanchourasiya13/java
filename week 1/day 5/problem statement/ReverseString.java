import java.util.Scanner;

public class ReverseString{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter a String: ");
        String str = input.nextLine();
        String result="";
for(int i=str.length()-1;i>=0;i--){
result+= str.charAt(i);
}
System.out.print("reversed string is: "+result);
    }
}


