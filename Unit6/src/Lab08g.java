//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Arrays;
import java.util.Scanner;

public class Lab08g
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		LoopStats ls = new LoopStats();
		for (int i = 0; i < 3; i++) {
			System.out.print("Enter a start number: ");
			int beg = keyboard.nextInt();
			System.out.print("Enter a stop number: ");
			int end = keyboard.nextInt();
			ls.setNums(beg, end);
			System.out.println(ls);
			System.out.println("total: " + ls.getTotal());
			System.out.println("even count: " + ls.getEvenCount());
			System.out.println("odd count: " + ls.getOddCount());
			System.out.println();
		}
	}
}