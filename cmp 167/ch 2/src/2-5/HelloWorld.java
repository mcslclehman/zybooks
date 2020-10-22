
import java.util.Scanner;

public class HelloWorld{

 	public static void main(String []args){
  	 
   	Scanner sc = new Scanner(System.in);
  	 
   	System.out.println("Please enter the amount of sentence");
   	String sentence = sc.nextLine();
  	  	     	 
    	System.out.println( "Sentence = " + sentence
                       	+ " Length = " + sentence.length() + " "
                       	+ "position of vowels a:" + sentence.indexOf('a')
                       	+ ",e:" + sentence.indexOf('e'));  	 
 	}
}
