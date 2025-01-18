import java.util.Scanner;
public class DoubleOpt {

    public static void main(String[] args) {
        // Create a input object for user input
        Scanner input  = new Scanner(System.in);

        // user to input three variables
        System.out.print("Enter a: ");
        double a = input.nextDouble();

        System.out.print("Enter b: ");
        double b = input.nextDouble();

        System.out.print("Enter c: ");
        double c = input.nextDouble();


        // Perform the  integer operations by precedence.
        // perform first operation on a,b,c
        double first =  a+b*c;

        // perform second operation on a,b,c
         double second =  a*b+c;

        // perform third operation on a,b,c
         double third =  c+a/b;

        // perform fourth operation on a,b,c
         double fourth =  a%b+c;

        // display the results
System.out.println("The operations perform on variables "+ a+","+b+" and "+c+" are "+ first+","+second+","+third+","+" and "+ fourth);

        // Close the input
        input.close();
    }
}
