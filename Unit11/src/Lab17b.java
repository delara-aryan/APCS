//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab17b
{
	public static void main( String args[] )
	{
   	Scanner keyboard = new Scanner(System.in);
   	WordPrinter wp = new WordPrinter();
   	String choice="";
		do{
			out.print("\nEnter the word to display :: ");
			String word = keyboard.next();
	
			out.print("Enter the times to display :: ");
 			int times = keyboard.nextInt();
		
			//call the printWord method
 			wp.printWord(word, times);
 			
			System.out.print("\nDo you want to enter more sample input? ");
			choice=keyboard.next();			
		}while(choice.equals("Y")||choice.equals("y"));		
	}
}