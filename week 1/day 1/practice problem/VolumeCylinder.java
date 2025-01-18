import java.util.*;
public  class VolumeCylinder
{
 public static void main(String args[])
    {
Scanner sc=new Scanner(System.in);
System.out.print("Enter radius:");
int radius=sc.nextInt();
System.out.print("Enter height:");
int height=sc.nextInt();
float pie=3.14f;
float Volume = pie * radius*radius * height;

System.out.println(Volume);
}
    }
