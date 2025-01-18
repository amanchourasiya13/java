//Write a Program to compute the volume of Earth in km^3 and miles^3
import java.lang.Math;   // It imports Mahematics library
public class Volume{
public static void main(String []args){

  // create variables and assign values
      int radiusKm=6378;
      float pi= 3.14f;
      float miles=1.6f;
      double radiusMiles=radiusKm*miles;
      double SphereKm= (4/3)*pi* Math.pow(radiusKm,3);   //Math.pow(); is use for power in  mathematics like radius^3;
      double SphereMiles=(4/3)*pi*Math.pow(radiusMiles,3);

  // display the result
      System.out.println("The Volume of earth in cubic kilometers is "+SphereKm+" and cubic miles is "+SphereMiles);
    }
}