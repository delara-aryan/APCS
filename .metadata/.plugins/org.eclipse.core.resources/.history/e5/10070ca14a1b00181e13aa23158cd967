package unit7;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		boolean b= true;
		Scanner keyboard = new Scanner(System.in);
		int response;
		String a;
		
		GuessingGame g;
		while(b)
		{
			
			System.out.println("Guessing Game - how many numbers?");
			response = keyboard.nextInt();
			 g = new GuessingGame(response);
			g.playGame();
			System.out.println("\n\n\n");
			System.out.println("Do you want to play again?   y/n");
			a = keyboard.next();
			if(a.equals("y"))
			{
				b=true;
			}
			else
			{
				b = false;
			}

	

		}
		
		



	}
}