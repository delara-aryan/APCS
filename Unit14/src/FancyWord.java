
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class FancyWord {
	private char[][] mat;

	public FancyWord() {
		mat = new char[0][0];
	}

	public FancyWord(String s) {
		int size = s.length();
		mat = new char[size][size];
		for (int i = 0; i < mat.length; i++) {
			if (i == 0 || i == size - 1) {
				for (int j = 0; j < mat[i].length; j++) {
					mat[i][j] = s.charAt(j);
				}
			} else {
				mat[i][i] = s.charAt(i);
				mat[i][mat[i].length - 1 - i] = s.charAt(mat[i].length - 1 - i);
			}
		}
	}

	public String toString() {
		String output = "";
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				output += mat[i][j];
			}
			output += "\n";
		}
		return output + "\n";
	}
}