//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Class
{
	private String name;
	private ArrayList<Student> studentList;
	
	public Class()
	{
		name="";
		studentList=new ArrayList<Student>();
	}
	
	public Class(String name, int stuCount)
	{
		this.name = name;
		studentList = new ArrayList<Student>();
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList.add(s);
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
		return total/studentList.size();
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList.get(stuNum).getAverage();
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
		return studentList.get(stuNum).getName();
	}

	public String getStudentWithHighestAverage()
	{
		studentList.sort(null);
		return studentList.get(studentList.size() - 1).getName();
	}

	public String getStudentWithLowestAverage()
	{
		studentList.sort(null);
		return studentList.get(0).getName();
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