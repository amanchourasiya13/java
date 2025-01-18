import java.util.*;
public  class PeriOfRect
{
 public static void main(String args[])
    {
Scanner sc=new Scanner(System.in);
System.out.print("Enter length:");
int length=sc.nextInt();

System.out.print("Enter width:");
int width=sc.nextInt();

int Perimeter= 2 * (length + width);

System.out.println("Perimter Of Rectangle : "+Perimeter);
}
    }