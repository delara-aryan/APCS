
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer {
	private char theChar;

	public CharacterAnalyzer() {
		theChar = 0;
	}

	public CharacterAnalyzer(char c) {
		setChar(c);
	}

	public void setChar(char c) {
		theChar = c;
	}

	public char getChar() {
		return theChar;
	}

	public boolean isUpper() {
		return Character.isUpperCase(theChar);
	}

	public boolean isLower() {
		return Character.isLowerCase(theChar);
	}

	public boolean isNumber() {
		return Character.isDigit(theChar);
	}

	public int getASCII() {
		return (int) theChar;
	}

	public String toString() {
		String s = "";
		if (isNumber()) {
			s += getChar() + " is a number. ";
		} else {
			if (isUpper()) {
				s += getChar() + " is an uppercase character. ";
			} else {
				s += getChar() + " is a lowercase character. ";
			}
		}
		s += "ASCII == " + getASCII();
		return s;
	}
}