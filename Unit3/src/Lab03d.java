//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03d
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Distance d = new Distance();
		int x1;
		int x2;
		int y1;
		int y2;
		for (int i = 0; i < 3; i++) {
			System.out.println("");
			System.out.print("Enter x1: ");
			x1 = keyboard.nextInt();
			System.out.print("Enter y1: ");
			y1 = keyboard.nextInt();
			System.out.print("Enter x2: ");
			x2 = keyboard.nextInt();
			System.out.print("Enter y2: ");
			y2 = keyboard.nextInt();
			d.setCoordinates(x1, y1, x2, y2);
			d.calcDistance();
			d.print();
		}
	}
}