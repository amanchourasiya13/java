import java.util.Scanner;
public  class SimpleInterest{

 float CalculateSI( int principal, float rate,float time){

float Si= (principal * rate * time) / 100;
  return Si;
}
 public static void main(String args[])
    {
Scanner sc=new Scanner(System.in);
System.out.print("Enter Principal:");
int principal=sc.nextInt();

System.out.print("Enter Rate:");
 float rate=sc.nextInt();

System.out.print("Enter Time:");
 float time=sc.nextInt();

 SimpleInterest obj=new SimpleInterest();
System.out.print("The Simple Interest is: "+ obj.CalculateSI(principal,rate,time)+ " for principal "+ principal + " rate of interest "+ rate+ " and time " + time);
   //obj.CalculateSI();
}
}