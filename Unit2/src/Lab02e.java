import java.util.Random;

//© A+ Computer Science  -  www.apluscompsci.com

public class Lab02e
{
	public static void main( String[] args ) {
		Circle c = new Circle();
		Random r = new Random();
		for (int i = 0; i < 5; i++) {
			c.setRadius(r.nextInt(50));
			c.calculateArea();
			c.print();
		}
	}
}