
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram {
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram() {
		letters = new ArrayList<Character>();
		count = new ArrayList<Integer>();
		fileName = "";
	}

	public Histogram(char[] values, String fName) {
		letters = new ArrayList<Character>();
		count = new ArrayList<Integer>();
		for (char c : values) {
			letters.add(c);
			count.add(0);
		}
		out.println("search letters = " + letters);
		fileName = fName;
	}

	public void loadAndAnalyzeFile() throws IOException {
		try {
			Scanner file = new Scanner(new File(fileName));
			while (file.hasNext()) {
				String s = file.next();
				for (int i = 0; i < s.length(); i++) {
					for (int j = 0; j < letters.size(); j++) {
						if (s.charAt(i) == letters.get(j)) {
							count.set(j, count.get(j) + 1);
						}
					}
				}
			}
		} catch (Exception e) {
			out.println("Houston we have a problem!");
		}
	}

	public char mostFrequent() {
		int max = 0;
		for (int i : count) {
			if (i > max) {
				max = i;
			}
		}
		return letters.get(count.indexOf(max));
	}

	public char leastFrequent() {
		int min = count.get(0);
		for (int i : count) {
			if (i < min) {
				min = i;
			}
		}
		return letters.get(count.indexOf(min));
	}

	public String toString() {
		return fileName + "\n" + letters + "\n" + count + "\n\n\n";
	}
}