
import java.util.Scanner;
public class Seconds_Converter{

 	public static void main(String []args){
  	 
   	Scanner sc = new Scanner(System.in);
  	 
   	System.out.println("Please enter the amount of seconds");
   	int n = sc.nextInt();
  	int day = n / (24 * 3600);
 	n = n % (24 * 3600);
    	int hour = n / 3600;
 	n %= 3600;
    	int minutes = n / 60 ;
 	 
    	n %= 60;
    	int seconds = n;
     	 
    	System.out.println( day + " " + "days " + hour
                       	+ " " + "hours " + minutes + " "
                       	+ "minutes " + seconds + " "
                       	+ "seconds ");
                                       }
             } 
