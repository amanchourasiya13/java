import java.util.Scanner;
public class SpringSeason {

  boolean SeasonCheck(int month,int day){

   // check it is spring season or not.

         if (month>=3 && month<=6 && day>=20){
         return true;
                         }
         else
             return  false;
    }
    public static void main(String[] args) {

        // Create a input object for user input
        Scanner input  = new Scanner(System.in);

   // create obj object to access SeasonCheck method with help of SpringSeason class.
            SpringSeason obj=new SpringSeason();


        // user to input  month and day 
        System.out.print("Enter month in number: ");
        int month = input.nextInt();

        System.out.print("Enter day: ");
        int day = input.nextInt();

   // display the result or call the SeasonCheck method.

System.out.print(obj.SeasonCheck(month,day));
        // Close the input
        input.close();
    }
}
