//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSort
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
	
		while(number!=0)
		{
			count++;
			number/=10 ;
			
		}
		
		
		return count;
	}
	
	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = null;
		
		sorted = new int[getNumDigits(number)];
		int count =0;
		while(number!=0)
		{		
		sorted[count]=number%10 ;
			number/=10;
			count++;
		}

		for (int i = 0; i < sorted.length-1; i++) {
			for (int j = 0; j < sorted.length-1; j++) {
				if(sorted[j]>sorted[j+1])
				{
					int temp = sorted[j];
					sorted[j]=sorted[j+1];
					sorted[j+1]=temp;
				}
			}
		}
		return  sorted;
	}
}