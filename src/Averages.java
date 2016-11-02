import java.util.Scanner;

/**
 * 
 */

/**
 * @author A.briggs
 *
 */
public class Averages {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**

		 *

		 * Name:Althea Briggs

		 * Teacher: Mr.Hardman 

		 * Assignment #3, Program #

		 * Date Last Modified: Oct.31

		 *

		 */

         

		Scanner userInput = new Scanner(System.in);
         double mark1;
         double mark2;
         double mark3;
         double mark4;
         double mark5;
         double totalAverage;
         
         
         System.out.println("Mark1:");
         mark1 = userInput.nextDouble();
        	 
         System.out.println("Mark2:");
         mark2 = userInput.nextDouble();
         
         System.out.println("Mark3:");
         mark3 = userInput.nextDouble();
         
         System.out.println("Mark4:");
         mark4 = userInput.nextDouble();
         
         System.out.println("Mark5:");
         mark5 = userInput.nextDouble();
         
         totalAverage = (mark1 + mark2 + mark3 + mark4 + mark5)/5;
         //String.Forest("Your average: {0, 10:0}" , average);
         
        System.out.println("\n" + String.format("%15s %20.2f", "mark1:", mark1) );
        System.out.println(String.format("%15s %20.2f", "mark2:", mark2) );
        System.out.println(String.format("%15s %20.2f", "mark3:", mark3) );
        System.out.println(String.format("%15s %20.2f", "mark4", mark4) );
        System.out.println( String.format("%15s %20.2f", "mark5", mark5) );
        
        System.out.println(String.format("%15s %20.2f", "TotalAverage",totalAverage) );
        
        
        userInput.close();
         
         
         
         
         
 

	}

}
