//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;
import java.util.Scanner;

public class Lab08i
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Prime p = new Prime();
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter a number: ");
			int prime = keyboard.nextInt();
			p.setPrime(prime);
			System.out.println(p);
			System.out.println();
		}		
	}	
}