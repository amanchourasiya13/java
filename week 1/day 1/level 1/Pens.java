/* Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each student will get if the pens must be divided equally. Also, find the remaining non-distributed pens. */

public class Pens{
public static void main(String []args){
     //create variables and assign values
       int Pen= 14;
       int Students=3;
       float PenGet=Pen/Students;             
       float PenRemain= Pen%Students;   // % is use for remainder 14%3=2

     //display the result

       System.out.println("The Pen Per Student is " +PenGet+ " and the remaining pen not distributed is " +PenRemain);
    }
}