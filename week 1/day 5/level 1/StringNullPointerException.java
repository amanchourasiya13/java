public class StringNullPointerException{

 public static  void StringGeneratorException(){
String str=null;
System.out.println(str.length());
}

public static void StringHandleException(){
String str=null ;
try{
System.out.println(str.length());
}
catch(NullPointerException e){
System.out.println("Caught a NullPointerException: " +e.getMessage());
}
}

public static void main(String []args){

System.out.print("Generating NullPointerException without handling:");
StringGeneratorException();


     System.out.print("\n Handling NullPointerException  with try and catch:");
StringHandleException();

    }
}