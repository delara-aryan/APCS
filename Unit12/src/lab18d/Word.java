//© A+ Computer Science  -  www.apluscompsci.com
package lab18d;

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}

	public int compareTo( Word rhs )
	{	
		String w = rhs.toString();
		if (word.length() > w.length()) {
			return 1;
		} else if (word.length() < w.length()) {
			return -1;
		} else {
			for (int i = 0; i < word.length(); i++) {
				if(word.charAt(i) < w.charAt(i)) {
<<<<<<< HEAD
					return 
=======
					return -1;
				} else if (word.charAt(i) > w.charAt(i)) {
					return 1;
>>>>>>> 75522839af370e60c5f3fc0427f8c4d3d7f4686d
				}
			}
		}
		return 0;
	}

	public String toString()
	{
		return word;
	}
}