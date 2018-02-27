//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab14d
{
	public static void main( String args[] )
	{
		//add test cases
		
		Grades g = new Grades(5, new Double[]{(double)100, (double)90,(double)85,72.5,95.6});
		System.out.println(g);
		g.setGrades(3, new Double[]{50.0,100.0,80.0} );
		System.out.println(g);
		g.setGrades(3, new Double[]{93.4, -90.0, 90.0});
		System.out.println(g);
		Double[] d = new Double[]{(double) 1,(double) 2,(double) 3,(double) 4,(double) 5,(double) 6,(double) 7,(double) 8,(double) 9};
		g.setGrades(9, d);
		System.out.println(g);
		
	}
}