//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe {
	private char[][] mat;

	public TicTacToe() {
		mat = new char[3][3];
	}

	public TicTacToe(String game) {
		mat = new char[3][3];
		int c = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = game.charAt(c++);
			}
		}

	}

	public String getWinner() {
		for (int i = 0; i < mat.length; i++) {
			int countx = 3;
			int counto = 3;

			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == 'X') {
					countx--;
				} else if (mat[i][j] == 'O') {
					counto--;
				}
				if (countx == 0) {
					return "X wins horizontally";
				} else if (counto == 0) {
					return "O wins horizontally";
				}
			}
		}
		for (int i = 0; i < mat.length; i++) {
			int countx = 3;
			int counto = 3;

			for (int j = 0; j < mat[i].length; j++) {
				if (mat[j][i] == 'X') {
					countx--;
				} else if (mat[j][i] == 'O') {
					counto--;
				}
				if (countx == 0) {
					return "X wins vertically";
				} else if (counto == 0) {
					return "O wins vertically";
				}

			}

		}
		int countx = 3;
		int counto = 3;

		for (int j = 0; j < mat[0].length; j++) {
			if (mat[j][j] == 'X') {
				countx--;

			} else if (mat[j][j] == 'O') {
				counto--;
			}
			if (countx == 0) {
				return "X wins diagonally";
			} else if (counto == 0) {
				return "O wins diagonally";
			}

		}

		countx = 3;
		counto = 3;
		int count = 0;
		for (int j = mat[0].length - 1; j >= 0; j--) {
			if (mat[count][j] == 'X') {
				countx--;

			} else if (mat[count][j] == 'O') {
				counto--;
			}
			if (countx == 0) {
				return "X wins diagonally";
			} else if (counto == 0) {
				return "O wins diagonally";
			}
			count++;
		}

		return "cat's game - no winner";
	}

	public String toString() {
		String output = "";
		for (char[] b : mat) {

			for (char b1 : b) {
				output += b1;
			}
			output += "\n";

		}
		output += getWinner();
		return output + "\n\n";
	}
}