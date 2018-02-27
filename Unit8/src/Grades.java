
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades {
	// instance variables
	Double[] b;
	int size;

	// constructor
	public Grades(int amount, Double[] a) {
		setGrades(amount, a);
	}

	// set method
	public void setGrades(int amount, Double[] a) {
		size = amount;
		b = a;
	}

	private double getSum() {
		double sum = 0.0;
		for (int i = 0; i < b.length; i++) {
			sum += b[i];
		}

		return sum;
	}

	public double getAverage() {
		double average = 0.0;
		average = getSum() / size;

		return average;
	}

	// toString method
	public String toString() {
		String s = "";
		for (int i = 0; i < b.length; i++) {
			s += "grade " + i + " ::     " + b[i] + "\n";
		}
		s += "\n average = " + getAverage();
		return s;

	}

}