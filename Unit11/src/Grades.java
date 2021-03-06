//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Grades
{
	private ArrayList<Double> grades;;
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String gradeList)
	{
		setGrades(gradeList);		
	}
	
	public void setGrades(String gradeList)
	{
		Scanner s  = new Scanner(gradeList);
		
		int size = s.nextInt();
		grades = new ArrayList<Double>();
		s.next();
		int i = 0;
		while (s.hasNext()) {
			double grade = s.nextDouble();
			grades.add(grade);
			i++;
		}
	}
	
	public void setGrade(int spot, double grade)
	{
		grades.set(spot, grade);
	}
	
	public double getSum()
	{
		double sum=0.0;
		for (double grade : grades) {
			sum += grade;
		}
		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;
		for (double grade : grades) {
			if (grade < low) {
				low = grade;
			}
		}
		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;
		for (double grade : grades) {
			if (grade > high) {
				high = grade;
			}
		}
		return high;
	}
	
	public int getNumGrades()
	{
		return grades.size();
	}
	
	public String toString()
	{
		String output="";
		for (double grade : grades) {
			output += grade + " ";
		}
		return output;
	}	
}