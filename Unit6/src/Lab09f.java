//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class Lab09f
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		LetterRemover lr = new LetterRemover();
		for (int i = 0; i < 4; i++) {
			System.out.println("Enter a sentence.");
			String sentence = keyboard.nextLine();
			System.out.println("Enter a character to remove.");
			char remove = keyboard.nextLine().charAt(0);
			lr.setRemover(sentence, remove);
			System.out.println(lr);
		}
	}
}