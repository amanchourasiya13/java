import java.util.Scanner;

public class StringIndexException{

 public static  void StringGeneratorException(String str){
Scanner input=new Scanner(System.in);
String result="";
int size= input.nextInt();
for(int i=0;i<=size;i++){
 result +=str.charAt(i);
}
System.out.print(result);
}

public static void StringHandleException(String str){

try{
Scanner input=new Scanner(System.in);
String result="";
int size= input.nextInt();
for(int i=0;i<=size;i++){
 result +=str.charAt(i);
}
System.out.print(result);
}

catch(StringIndexOutOfBoundsException e){
System.out.println("Caught a StringIndexOutOfBoundsException: " +e.getMessage());
}
}

public static void main(String []args){

Scanner input=new Scanner(System.in);
System.out.print(" Enter String: ");
String str=input.next();

System.out.print("\n Generating StringIndexOutOfBoundsException without handling:");
StringGeneratorException(str);

 System.out.print("\n Handling String Exception  with try and catch:");
   StringHandleException(str);

    }
}