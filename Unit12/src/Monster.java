//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Monster implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;

	//write a default Constructor
	public Monster() {
		setHeight(0);
		setWeight(0);
		setAge(0);
	}


	//write an initialization constructor with an int parameter ht
	public Monster(int ht) {
		setHeight(ht);
	}

	//write an initialization constructor with int parameters ht and wt
	public Monster(int ht, int wt) {
		setHeight(ht);
		setWeight(wt);
	}

	//write an initialization constructor with int parameters ht, wt, and age
	public Monster(int ht, int wt, int age) {
		setHeight(ht);
		setWeight(wt);
		setAge(age);
	}

	//modifiers - write set methods for height, weight, and age
	public void setHeight(int height) {
		myHeight = height;
	}
	
	public void setWeight(int weight) {
		myWeight = weight;
	}
	
	public void setAge(int age) {
		myAge = age;
	}
	
	
	//accessors - write get methods for height, weight, and age
	public int getHeight() {
		return myHeight;
	}
	
	public int getWeight() {
		return myWeight;
	}
	
	public int getAge() {
		return myAge;
	}
	
	
	//creates a new copy of this Object
	public Object clone()
	{
	   return new Monster(getHeight(), getWeight(), getAge());
	}

	public boolean equals(Object obj)
	{
		Monster m = (Monster)obj;
		return getHeight()==m.getHeight() && getWeight()==m.getWeight() && getAge()==m.getAge(); 
	}

	public int compareTo( Object obj )
	{
		Monster m = (Monster)obj;
		if (getHeight() > m.getHeight()) {
			return 1;
		} else if (getHeight() < m.getHeight()) {
			return -1;
		} else if (getWeight() > m.getWeight()) {
			return 1;
		} else if (getWeight() < m.getWeight()) {
			return -1;
		} else if (getAge() > m.getAge()) {
			return 1;
		} else if (getAge() < m.getAge()) {
			return -1;
		} else {
			return 0;
		}
		
	}

	//write a toString() method
	public String toString() {
		return getHeight() + " " + getWeight() + " " + getAge();
	}
	
}