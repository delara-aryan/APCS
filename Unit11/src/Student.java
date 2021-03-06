//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Student implements Comparable
{
	private String myName;
	private Grades myGrades;
	
	public Student()
	{
		setName("");
		setGrades("");
	}
	
	public Student(String name, String gradeList)
	{
		setName(name);
		setGrades(gradeList);
	}
	
	public void setName(String name)
	{
		myName = name;
	}	
	
	public void setGrades(String gradeList)
	{
		myGrades = new Grades(gradeList);
	}
	
	public void setGrade(int spot, double grade)
	{
		myGrades.setGrade(spot, grade);
	}

	public String getName()
	{
		return myName;
	}
	
	public int getNumGrades()
	{
		return myGrades.getNumGrades();
	}

	public double getSum()
	{
		return myGrades.getSum();
	}
	
	public double getAverage()
	{
		return myGrades.getSum()/myGrades.getNumGrades();
	}

	public double getAverageMinusLow()
	{
		double total = myGrades.getSum() - myGrades.getLowGrade();
		return total/(myGrades.getNumGrades() - 1);
	}
	
	public double getHighGrade()
	{
		return myGrades.getHighGrade();		
	}
	
	public double getLowGrade()
	{
		return myGrades.getLowGrade();	
	}
	
	public String toString()
	{
		return getName() + " = " + myGrades;
	}

	@Override
	public int compareTo(Object arg0) {
		Student student = (Student)arg0;
		if (getAverage() > student.getAverage()) {
			return 1;
		} else if (getAverage() < student.getAverage()){
			return -1;
		} else {
			return 0;
		}
	}	
	
	public boolean equals(Student student) {
		return getAverage()==student.getAverage();
	}
}