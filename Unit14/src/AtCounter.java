//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class AtCounter
{
   private char[][] atMat;
   private int atCount;

	public AtCounter()
	{
		atCount=0;
		atMat = new char[][]{{'@','-','@','-','-','@','-','@','@','@'},
							{'@','@','@','-','@','@','-','@','-','@'},
							{'-','-','-','-','-','-','-','@','@','@'},
							{'-','@','@','@','@','@','-','@','-','@'},
							{'-','@','-','@','-','@','-','@','-','@'},
							{'@','@','@','@','@','@','-','@','@','@'},
							{'-','@','-','@','-','@','-','-','-','@'},
							{'-','@','@','@','-','@','-','-','-','-'},
							{'-','@','-','@','-','@','-','@','@','@'},
							{'-','@','@','@','@','@','-','@','@','@'}};
	}

	public int countAts(int r, int c)
	{
		if (r < atMat.length && r >= 0 && c < atMat[r].length && c >= 0 && atMat[r][c] == '@') {
			atCount++;
			atMat[r][c] = 'x';
			countAts(r, c + 1);
			countAts(r, c - 1);
			countAts(r + 1, c);
			countAts(r - 1, c);
		}
		return atCount;
	}

	public int getAtCount()
	{
		return atCount;
	}

	public String toString()
	{
		String output="";
		output+=getAtCount()+" @s connected.";
		return output;
	}
}