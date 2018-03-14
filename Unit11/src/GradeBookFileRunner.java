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

public class GradeBookFileRunner 
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!");
		
		@SuppressWarnings("resource")
		Scanner file = new Scanner(new File("gradebook.dat"));

		String className = file.nextLine();
		int numStudents = file.nextInt();
		Class c = new Class(className, numStudents);
		file.nextLine();
		for (int i = 0; i < numStudents; i++) {
			String name = file.nextLine();
			String grades = file.nextLine();
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