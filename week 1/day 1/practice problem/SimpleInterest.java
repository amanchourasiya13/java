import java.util.*;
public  class SimpleInterest{
 public static void main(String args[])
    {
Scanner sc=new Scanner(System.in);
System.out.print("Enter Principal:");
int Principal=sc.nextInt();

System.out.print("Enter Rate:");
int Rate=sc.nextInt();

System.out.print("Enter Time:");
int Time=sc.nextInt();

int Si= (Principal * Rate * Time) / 100;

System.out.println("Simple Interest: "+Si);
}
}