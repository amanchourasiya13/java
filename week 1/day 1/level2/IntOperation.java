import java.util.Scanner;
public class IntOperation {

    public static void main(String[] args) {
        // Create a input object for user input
        Scanner input  = new Scanner(System.in);

        // user to input three variables
        System.out.print("Enter a: ");
        int a = input.nextInt();

        System.out.print("Enter b: ");
        int b = input.nextInt();

        System.out.print("Enter c: ");
        int c = input.nextInt();


        // Perform the  integer operations by precedence.
        // perform first operation on a,b,c
         int  first =  a+b*c;

        // perform second operation on a,b,c
         int  second =  a*b+c;

        // perform third operation on a,b,c
         int  third =  c+a/b;

        // perform fourth operation on a,b,c
         int  fourth =  a%b+c;

        // display the results
System.out.println("The operations perform on variables "+ a+","+b+" and "+c+" are "+ first+","+second+","+third+","+" and "+ fourth);

        // Close the input
        input.close();
    }
}
