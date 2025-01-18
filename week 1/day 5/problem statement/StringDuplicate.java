import java.util.Scanner;

public class StringDuplicate{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter a String: ");
        String str = input.nextLine();
        String result="";
  for(int i=0;i<str.length();i++){
String ch=""+str.charAt(i);
if(result.contains(ch)){
continue;
}
result+=ch;
}
System.out.print("modified string is: "+result);

    }
}


