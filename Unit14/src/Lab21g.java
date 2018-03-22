//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab21g
{
	public static void main(String args[])
	{
		AtCounter counter = new AtCounter();
		counter.countAts(0, 0);
		System.out.println("0 0 has " + counter);
		
		counter = new AtCounter();
		counter.countAts(2, 5);
		System.out.println("2 5 has " + counter);
		
		counter = new AtCounter();
		counter.countAts(5, 0);
		System.out.println("5 0 has " + counter);
		
		counter = new AtCounter();
		counter.countAts(9, 9);
		System.out.println("9 0 has " + counter);
		
		counter = new AtCounter();
		counter.countAts(3, 9);
		System.out.println("3 9 has " + counter);
		
	}
}