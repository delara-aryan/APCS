//� A+ Computer Science  -  www.apluscompsci.com

public class Fahrenheit
{
	private double fahrenheit;

	public void setFahrenheit(double fahren)
	{
		fahrenheit = fahren;
	}

	public double getCelsius()
	{
		double celsius = 0.0;
		//add code to convert fahrenheit to celsius
		celsius = ((double)5/9)*(fahrenheit - 32);
		return celsius;
	}

	public void print()
	{
		//this is part of the solution
		System.out.println(String.format("%.3f", fahrenheit) +
						   " degrees Fahrenheit = " +
						   String.format("%.3f", getCelsius()) +
						   " degrees Celsius");
	}
}