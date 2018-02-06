import java.util.Random;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab02f
{
	public static void main( String args[] )
    {
		Line l = new Line(1, 2 ,3, 4);
		l.calculateSlope();
		l.print();
		Random r = new Random();
		for (int i = 0; i < 5; i++) {
			l.setCoordinates(r.nextInt(20), r.nextInt(20), r.nextInt(20), r.nextInt(20));
			l.calculateSlope();
			l.print();
		}
	}
}