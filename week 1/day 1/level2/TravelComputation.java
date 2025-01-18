import java.util.Scanner;
// Create TravelComputation Class to compute the Distance and Travel Time
class TravelComputation {
   
   public static void main(String[] args) {
   Scanner input=new Scanner(System.in);
      // Create a variable input name to indicate the person traveling
        System.out.print("Enter name: ");
        String name =input.nextLine();
      
      // Create a input  variable fromCity, viaCity and toCity to indicate the city
      // from city, via city and to city the person is travelling

       System.out.print("Enter fromCity: ");
       String fromCity =input.nextLine();

       System.out.print("Enter viaCity: ");
       String viaCity =input.nextLine();
 
       System.out.print("Enter toCity: "); 
       String toCity =input.nextLine();

      // Create a input variable distanceFromToVia to indicate the distance 
      // between the fromCity to viaCity

      System.out.print("Enter distance FromToVia: ");
      double distanceFromToVia = input.nextDouble();

      // Create a input variable timeFromToVia to indicate the time taken to 
      // travel from fromCity to viaCity in minutes
      int timeFromToVia = 4 * 60 + 4;

      // Create a input variable distanceViaToFinalCity to indicate the distance 
      // between the viaCity to toCity


      System.out.print("Enter distance via To final city  : ");
      double distanceViaToFinalCity =input.nextDouble();

      // Create a variable timeViaToFinalCity to indicate the time taken to
      // travel from viaCity to toCity in minutes
      int timeViaToFinalCity = 4 * 60 + 25;

      // Create a variable totalDistance to indicate the total distance
      // between the fromCity to toCity
      double totalDistance = distanceFromToVia + distanceViaToFinalCity;

      // Create a variable totalTime to indicate the total time taken to
      // travel from fromCity to toCity in minutes
      int totalTime = timeFromToVia + timeViaToFinalCity;


      // Print the travel details
      System.out.println("The Total Distance travelled by " + name + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");
   // Close the input
        input.close();

   }
}
