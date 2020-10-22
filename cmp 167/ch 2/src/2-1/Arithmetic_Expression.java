import java.util.Scanner;


public class Arithmetic_Expression {
  
  public static void main (String args [] ) {
      
      Scanner scnr = new Scanner(System.in);
      
      double firstDouble;
      double secondDouble;
      double thirdDouble;
      
      System.out.println("Enter firstDouble: ");
      firstDouble = scnr.nextDouble();
      
      System.out.println("Enter firstDouble: ");
      secondDouble = scnr.nextDouble();
      
      System.out.println("Enter firstDouble: ");
      thirdDouble = scnr.nextDouble();
      
      double resultOne = (thirdDouble + secondDouble)/firstDouble;      
      double resultTwo = (thirdDouble * secondDouble)/(firstDouble + secondDouble);
      
      System.out.println("First Result " + resultOne);
      System.out.println("Second Result " + resultTwo);
 
   }
}



