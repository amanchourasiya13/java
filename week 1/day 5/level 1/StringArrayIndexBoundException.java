import java.util.Scanner;

public class StringArrayIndexBoundException{

 public static  void StringGeneratorException(String[] names){
 String name=names[5];
}

public static void StringHandleException(String[] names){

try{
StringGeneratorException(names);
}

catch(ArrayIndexOutOfBoundsException  e){
System.out.println("Caught a ArrayIndexOutOfBoundsException : " +e.getMessage());
}
}

public static void main(String []args){

Scanner input=new Scanner(System.in);
System.out.print(" Enter no  of size of array: ");
int size=input.nextInt();
String names[]=new String[size];

 for (int i = 0; i <size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = input.nextLine();
        }

System.out.print("\n Generating ArrayIndexOutOfBoundsException  without handling:");
StringGeneratorException(names);

System.out.print("\n Handling ArrayIndexOutOfBoundsException with try and catch:");
 StringHandleException(names);
    }
}