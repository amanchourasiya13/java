import java.util.*;
public  class Temperature{
 public static void main(String args[])
    {
Scanner sc=new Scanner(System.in);
System.out.print("Enter Celsius :");
int Celsius=sc.nextInt();
int Fahrenheit = (Celsius * 9/5) + 32;
System.out.println("Fahrenhit is:"+Fahrenheit);
}
}