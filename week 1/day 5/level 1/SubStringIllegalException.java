import java.util.Scanner;

public class SubStringIllegalException{

 public static  void StringGeneratorException(String str){
 Scanner input=new Scanner(System.in);
String result ="";
System.out.print("enter index: ");
int start= input.nextInt();
int end=input.nextInt();
result=str.substring(start,end);
System.out.println(result);
}

public static void StringIllegalArgumentException(String str){

try{
//Scanner input=new Scanner(System.in);
//System.outprint("enter substring start index: ");
//int start= input.nextInt();
//System.outprint("enter substring end index: ");
//int end=input.nextInt();
//String result=str.substring(start,end);
//System.out.print(result);
StringGeneratorException(str);
}
catch(IllegalArgumentException e){
System.out.println("Caught a IllegalArgumentException: " +e.getMessage());
}
}

public static void main(String []args){

Scanner input=new Scanner(System.in);
System.out.print(" Enter String: ");
String str=input.next();

System.out.print("\n Generating IllegealArgumentException without handling:");
StringGeneratorException(str);

System.out.print("\n Handling IllegalArgumentException  with try and catch:");
 StringIllegalArgumentException(str);
    }
}