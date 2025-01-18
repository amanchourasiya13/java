import java.util.Scanner;
public  class MaxNum{

 double MaxHandShake(double number){
 double max= (number*(number-1))/2;
return max;
}
 public static void main(String args[])
    {
// create an input object
Scanner input =new Scanner(System.in);

// ask user to enter number of students.
System.out.print("Enter Number of student: ");
double number=input.nextDouble();

// creating object  obj to access MaxHandShake
 MaxNum obj=new MaxNum();

// display the result.
System.out.print("For number of students "+ number+ " the maximum of Handshakes are: "+ obj.MaxHandShake(number));

    }
}