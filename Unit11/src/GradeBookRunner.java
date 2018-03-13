//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

import java.io.File;
import java.io.FileNotFoundException;

public class GradeBookRunner
{
   public static void main( String args[] ) throws FileNotFoundException
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a file name containing gradebook information: ");
		String fileName = keyboard.nextLine();
		
		Scanner gradebook = new Scanner(new File(fileName));
		
		String className = gradebook.nextLine();
		int numStudents = gradebook.nextInt();
		Class c = new Class(className, numStudents);
		
		for (int i = 0; i < numStudents; i++) {
			String name = gradebook.nextLine();
			String grades = gradebook.nextLine();
			Student s = new Student(name, grades);
			c.addStudent(i, s);
		}
		
		System.out.println(c);
		out.println("Failure List = " + c.getFailureList(70));	
		out.println("Highest Average = " + c.getStudentWithHighestAverage());
		out.println("Lowest Average = " + c.getStudentWithLowestAverage());
		out.println(String.format("Class Average = %.2f",c.getClassAverage()));
	}		
}