//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Lab05d
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		CharacterAnalyzer test = new CharacterAnalyzer();
		
		for (int i = 0; i < 10; i++) {
			out.print("Enter a letter :: ");
			test.setChar(keyboard.next().charAt(0));
			System.out.println(test);
		}
	}
}