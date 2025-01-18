import java.util.Scanner;
public class MaximumHandshake{
public static void main(String[]args){

  // Create input object to read user input
       Scanner input=new Scanner(System.in);

  //   user to enter  no. of students
       System.out.print("Enter No. of Student: ");
       int  numberOfStudents=input.nextInt();

  // calculate maximum no of handshakes
       double maximumHandshake=(numberOfStudents*(numberOfStudents-1))/2;

  // Display the result
       System.out.println("The number of possible handshakes "+ maximumHandshake);
           // Close the input
       input.close();
    }
}