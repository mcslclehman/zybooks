
import java.util.Scanner;

public class MidpointFormula
{
     // Driver code
    public static void main (String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
       
        System.out.println(“Enter the first x coordinate”);
        double x1 = sc.nextDouble();
        System.out.println(“Enter the second x coordinate”);
        double x2 = sc.nextDouble();     
        System.out.println(“Enter the first y coordinate”);
        double y1 = sc.nextDouble();
        System.out.println(“Enter the second y coordinate”);
        double y2 = sc.nextDouble();
     
        System.out.print((x1 + x2) / 2 +
                        " , " + (y1 + y2) / 2) ; }
} 
