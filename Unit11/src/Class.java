//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Class
{
	private String name;
	private Student[] studentList;
	
	public Class()
	{
		name="";
		studentList=new Student[0];
	}
	
	public Class(String name, int stuCount)
	{
		this.name = name;
		studentList = new Student[stuCount];
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList[stuNum] = s;
	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double total=0.0;
		for (Student s : studentList) {
			total += s.getAverage();
		}
		return total/studentList.length;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList[stuNum].getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		double average = 0.0;
		for (Student s : studentList) {
			if (s.getName().equals(stuName)) {
				average = s.getAverage();
			}
		}
		return average;
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList[stuNum].getName();
	}

	public String getStudentWithHighestAverage()
	{
		Arrays.sort(studentList);
		return studentList[studentList.length - 1].getName();
	}

	public String getStudentWithLowestAverage()
	{
		Arrays.sort(studentList);
		return studentList[0].getName();
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		for (Student s : studentList) {
			if (s.getAverage() <= failingGrade) {
				output += s.getName() + ", ";
			}
		}
		return output;
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";
		for (Student s : studentList) {
			output += s + "\t" + String.format("%.2f", s.getAverage()) + "\n";
		}
		return output;
	}  	
}