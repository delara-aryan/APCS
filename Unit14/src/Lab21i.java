//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		Scanner s = new Scanner(new File("lab21i.dat"));
		Maze m;
		int r;
		while (s.hasNextLine()) {
			r = s.nextInt();
			s.nextLine();
			m = new Maze(r, s.nextLine());
			System.out.println(m);
		}
	}
}