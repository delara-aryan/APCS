package unit7;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;

	public GuessingGame(int stop)
	{
		upperBound = stop;

	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		Random r= new Random();
		int num = r.nextInt(upperBound)+1;
		int guess = -1;
		int tries = 0;
		double p;
		while(guess!=num)
		{
			System.out.println("Enter a number in between 1 and "+upperBound);
			 guess= keyboard.nextInt();
			 if(guess<=0 || guess> upperBound)
			 {
				 System.out.println("Number out of Range!!!");
			 }
			 
			 tries+=1;
		}
		p = 1-(1.0/tries);
		System.out.println("It took "+ tries +" guesses to guess "+num);
		System.out.println("You guessed wrong "+ p +" percent of the time");

	}

	public String toString()
	{
		String output="";
		return output;
	}
}