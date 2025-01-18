import java.util.*;
public  class Miles
{
 public static void main(String args[])
    {
Scanner sc=new Scanner(System.in);
System.out.print("Enter Kilometer:");
int Kilometers=sc.nextInt();
double Miles= Kilometers * 0.621371;
System.out.print("Km into miles is:"+ Miles);
}
   }