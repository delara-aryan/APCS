//� A+ Computer Science  -  www.apluscompsci.com

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Quadratic quad = new Quadratic();
		int a;
		int b;
		int c;
		for (int i = 0; i < 3; i++) {
			System.out.println("");
			System.out.print("Enter a: ");
			a = keyboard.nextInt();
			System.out.print("Enter b: ");
			b = keyboard.nextInt();
			System.out.print("Enter c: ");
			c = keyboard.nextInt();
			quad.setEquation(a, b, c);
			quad.calcRoots();
			System.out.println("");
			quad.print();
		}
    }
}