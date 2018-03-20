//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
package lab18e;

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s)
	{
		word = s;
	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		for (int i = 0; i < word.length(); i++) {
			if (vowels.contains("" + word.charAt(i))) {
				vowelCount++;
			}
		}
		return vowelCount;
	}

	public int compareTo(Word rhs)
	{
		if (numVowels() < rhs.numVowels()) {
			return -1;
		} else if (numVowels() > rhs.numVowels()) {
			return 1;
		} else {
			String w = rhs.toString();
			for (int i = 0; i < word.length(); i++) {
				if(word.charAt(i) < w.charAt(i)) {
					return -1;
				} else if (word.charAt(i) > w.charAt(i)) {
					return 1;
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