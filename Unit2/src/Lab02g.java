import java.util.Random;

//© A+ Computer Science  -  www.apluscompsci.com

public class Lab02g
{
	public static void main( String[] args )
	{
		Fahrenheit f = new Fahrenheit();
		Random r = new Random();
		for (int i = 0; i < 5; i++) {
			f.setFahrenheit(r.nextDouble()*100);
			f.print();
		}	
	}
}