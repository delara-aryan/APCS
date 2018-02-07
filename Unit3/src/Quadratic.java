//© A+ Computer Science  -  www.apluscompsci.com

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
		a = 1;
		b = 2;
		c = 1;
	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
 	}

	public void calcRoots( )
	{
		double A = (double)a;
		double B = (double)b;
		double C = (double)c;
		rootOne = (-B + Math.sqrt(B*B - 4*A*C))/(2*A);
		rootTwo = (-B - Math.sqrt(B*B - 4*A*C))/(2*A);
	}

	public void print( )
	{
		System.out.println("root one: " + String.format("%.3f", rootOne));
		System.out.println("root two: " + String.format("%.3f", rootTwo));
	}
}