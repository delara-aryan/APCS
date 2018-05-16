import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture. This class inherits from SimplePicture and
 * allows the student to add functionality to the Picture class.
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture {
	///////////////////// constructors //////////////////////////////////

	/**
	 * Constructor that takes no arguments
	 */
	public Picture() {
		/*
		 * not needed but use it to show students the implicit call to super()
		 * child constructors always call a parent constructor
		 */
		super();
	}

	/**
	 * Constructor that takes a file name and creates the picture
	 * 
	 * @param fileName
	 *            the name of the file to create the picture from
	 */
	public Picture(String fileName) {
		// let the parent class handle this fileName
		super(fileName);
	}

	/**
	 * Constructor that takes the width and height
	 * 
	 * @param height
	 *            the height of the desired picture
	 * @param width
	 *            the width of the desired picture
	 */
	public Picture(int height, int width) {
		// let the parent class handle this width and height
		super(width, height);
	}

	/**
	 * Constructor that takes a picture and creates a copy of that picture
	 * 
	 * @param copyPicture
	 *            the picture to copy
	 */
	public Picture(Picture copyPicture) {
		// let the parent class do the copy
		super(copyPicture);
	}

	/**
	 * Constructor that takes a buffered image
	 * 
	 * @param image
	 *            the buffered image to use
	 */
	public Picture(BufferedImage image) {
		super(image);
	}

	////////////////////// methods ///////////////////////////////////////

	/**
	 * Method to return a string with information about this picture.
	 * 
	 * @return a string with information about the picture such as fileName,
	 *         height and width.
	 */
	public String toString() {
		String output = "Picture, filename " + getFileName() + " height " + getHeight() + " width " + getWidth();
		return output;

	}

	/** Method to set the blue to 0 */
	public void zeroBlue() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setBlue(0);
			}
		}
	}

	public void keepOnlyBlue() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setGreen(0);
				pixelObj.setRed(0);
			}
		}
	}

	public void keepOnlyRed() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setGreen(0);
				pixelObj.setBlue(0);
			}
		}
	}

	public void keepOnlyGreen() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setRed(0);
				pixelObj.setBlue(0);
			}
		}
	}

	public void negate() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setRed(255 - pixelObj.getRed());
				pixelObj.setBlue(255 - pixelObj.getBlue());
				pixelObj.setGreen(255 - pixelObj.getGreen());
			}
		}
	}

	public void grayscale() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				int average = (pixelObj.getBlue() + pixelObj.getRed() + pixelObj.getGreen()) / 3;
				pixelObj.setRed(average);
				pixelObj.setBlue(average);
				pixelObj.setGreen(average);
			}
		}
	}

	/**
	 * Method that mirrors the picture around a vertical mirror in the center of
	 * the picture from left to right
	 */
	public void mirrorVertical() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < width / 2; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	public void mirrorVerticalRightToLeft() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < width / 2; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				leftPixel.setColor(rightPixel.getColor());
			}
		}
	}

	public void mirrorHorizontal() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel bottomPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length / 2; row++) {
			for (int col = 0; col < width; col++) {
				topPixel = pixels[row][col];
				bottomPixel = pixels[pixels.length - 1 - row][col];
				bottomPixel.setColor(topPixel.getColor());
			}
		}
	}

	public void mirrorHorizontalBotToTop() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel bottomPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length / 2; row++) {
			for (int col = 0; col < width; col++) {
				bottomPixel = pixels[pixels.length - 1 - row][col];
				topPixel = pixels[row][col];

				topPixel.setColor(bottomPixel.getColor());
			}
		}
	}

	/** Mirror just part of a picture of a temple */
	public void mirrorTemple() {
		int mirrorPoint = 276;
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int count = 0;
		Pixel[][] pixels = this.getPixels2D();

		// loop through the rows
		for (int row = 27; row < 97; row++) {
			// loop from 13 to just before the mirror point
			for (int col = 13; col < mirrorPoint; col++) {

				leftPixel = pixels[row][col];
				rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
				rightPixel.setColor(leftPixel.getColor());
				count++;
			}
		}
		System.out.println(count);
	}

	public void mirrorArms() {
		int mirrorPoint = 196;
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel[][] pixels = this.getPixels2D();

		// loop through the rows
		for (int row = 162; row < mirrorPoint; row++) {
			// loop from 13 to just before the mirror point
			for (int col = 106; col < 293; col++) {

				leftPixel = pixels[row][col];
				rightPixel = pixels[mirrorPoint - row + mirrorPoint][col];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	public void mirrorGull() {
		int mirrorPoint = 344;
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel[][] pixels = this.getPixels2D();

		// loop through the rows
		for (int row = 235; row < 319; row++) {
			// loop from 13 to just before the mirror point
			for (int col = 235; col < mirrorPoint; col++) {

				leftPixel = pixels[row][col];
				rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	public void mirrorDiagonal() // mirrors from top right to bottom left
	{
		Pixel[][] pixels = this.getPixels2D();
		Pixel topRightPixel = null;
		Pixel bottomLeftPixel = null;
		int maxLength;
		if (pixels.length < pixels[0].length) {
			maxLength = pixels.length;
		} else {
			maxLength = pixels[0].length;
		}

		for (int row = 0; row < maxLength; row++) {
			for (int col = row; col < maxLength; col++) {
				topRightPixel = pixels[row][col];
				bottomLeftPixel = pixels[col][row];
				bottomLeftPixel.setColor(topRightPixel.getColor());
			}
		}
	}

	/**
	 * copy from the passed fromPic to the specified startRow and startCol in
	 * the current picture
	 * 
	 * @param fromPic
	 *            the picture to copy from
	 * @param startRow
	 *            the start row to copy to
	 * @param startCol
	 *            the start col to copy to
	 */
	public void copy(Picture fromPic, int startRow, int startCol) {
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length
				&& toRow < toPixels.length; fromRow++, toRow++) {
			for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length
					&& toCol < toPixels[0].length; fromCol++, toCol++) {
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}
		}
	}

	public void copy2(Picture fromPic, int startRow, int endRow, int startCol, int endCol) {
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length && toRow < endRow; fromRow++, toRow++) {
			for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length
					&& toCol < endCol; fromCol++, toCol++) {
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}
		}
	}

	/** Method to create a collage of several pictures */
	public void createCollage() {
		Picture flower1 = new Picture("flower1.jpg");
		Picture flower2 = new Picture("flower2.jpg");
		this.copy(flower1, 0, 0);
		this.copy(flower2, 100, 0);
		this.copy(flower1, 200, 0);
		Picture flowerNoBlue = new Picture(flower2);
		flowerNoBlue.zeroBlue();
		this.copy(flowerNoBlue, 300, 0);
		this.copy(flower1, 400, 0);
		this.copy(flower2, 500, 0);
		this.mirrorVertical();
		this.write("collage.jpg");
	}

	/**
	 * Method to show large changes in color
	 * 
	 * @param edgeDist
	 *            the distance for finding edges
	 */
	public void edgeDetection(int edgeDist) {
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		Color rightColor = null;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < pixels[0].length - 1; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][col + 1];
				rightColor = rightPixel.getColor();
				if (leftPixel.colorDistance(rightColor) > edgeDist)
					leftPixel.setColor(Color.BLACK);
				else
					leftPixel.setColor(Color.WHITE);
			}
		}
	}

	public void fixUnderwater() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				if (pixelObj.getBlue() > pixelObj.getGreen() && pixelObj.getBlue() > pixelObj.getRed()) {

					pixelObj.setBlue(pixelObj.getBlue() * 2);
				}
			}
		}
	}

	public void edgeDetection2(int edgeDist) {
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel topPixel = null;
		Pixel bottomPixel = null;
		Pixel[][] pixels = this.getPixels2D();

		for (int row = 0; row < pixels.length - 1; row++) {
			for (int col = 0; col < pixels[0].length - 1; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][col + 1];
				topPixel = pixels[row][col];
				bottomPixel = pixels[row + 1][col];
				if (leftPixel.colorDistance(rightPixel.getColor()) > edgeDist
						|| topPixel.colorDistance(bottomPixel.getColor()) > edgeDist)
					leftPixel.setColor(Color.BLACK);
				else
					leftPixel.setColor(Color.WHITE);
			}
		}
	}

	public void sharpen(int x, int y, int w, int h) {
		System.out.println("Delara Aryan");
		System.out.println("Period 2");
		System.out.println("4/24/18");
		System.out.println("Computer #08");
		Pixel[][] pixels = this.getPixels2D();
		Pixel topLeft = null;
		Pixel current = null;
		if (x == 0) {
			x++;
		}
		if (y == 0) {
			y++;
		}
		for (int row = y; row <= h; row++) {
			for (int col = x; col <= w; col++) {
				current = pixels[row][col];
				topLeft = pixels[row - 1][col - 1];
				int newRed = current.getRed() + (current.getRed() - topLeft.getRed()) / 2;
				if (newRed > 255) {
					current.setRed(255);
				} else if (newRed < 0) {
					current.setRed(0);
				} else {
					current.setRed(newRed);
				}
				int newGreen = current.getGreen() + (current.getGreen() - topLeft.getGreen()) / 2;
				if (newGreen > 255) {
					current.setGreen(255);
				} else if (newGreen < 0) {
					current.setGreen(0);
				} else {
					current.setGreen(newGreen);
				}
				int newBlue = current.getBlue() + (current.getBlue() - topLeft.getBlue()) / 2;
				if (newBlue > 255) {
					current.setBlue(255);
				} else if (newBlue < 0) {
					current.setBlue(0);
				} else {
					current.setBlue(newBlue);
				}
			}

		}
	}

	/**
	 * Hide a black and white message in the current picture by changing the red
	 * to even and then setting it to odd if the message pixel is black
	 * 
	 * @param messagePict
	 *            the picture with a message
	 */
	/*
	 * public void encode(Picture messagePict) {
	 * 
	 * Pixel[][] messagePixels = messagePict.getPixels2D(); Pixel[][] currPixels
	 * = this.getPixels2D(); Pixel currPixel = null; Pixel messagePixel = null;
	 * int count = 0; for (int row = 0; row < this.getHeight(); row++) { for
	 * (int col = 0; col < this.getWidth(); col++) { // if the current pixel red
	 * is odd make it even currPixel = currPixels[row][col]; if
	 * (currPixel.getRed() % 2 == 1) currPixel.setRed(currPixel.getRed() - 1);
	 * messagePixel = messagePixels[row][col]; if
	 * (messagePixel.colorDistance(Color.BLACK) < 50) {
	 * currPixel.setRed(currPixel.getRed() + 1); count++; } } }
	 * System.out.println(count); }
	 */
	public void encode(Picture messagePict) {
		Pixel[][] messagePixels = messagePict.getPixels2D();
		Pixel[][] currPixels = this.getPixels2D();
		Pixel currPixel = null;
		Pixel messagePixel = null;
		Pixel leftPixel = null;
		for (int row = 0; row < this.getHeight(); row++) {
			for (int col = 1; col < this.getWidth() - 1; col++) {
				currPixel = currPixels[row][col];
				leftPixel = currPixels[row][col - 1];
				if (currPixel.equals(leftPixel)) {
					currPixel.setRed(currPixel.getRed() + 1);
					currPixel.setGreen(currPixel.getGreen() + 1);
					currPixel.setBlue(currPixel.getBlue() + 1);
				}
			}
		}
		for (int row = 0; row < messagePict.getHeight(); row++) {
			for (int col = 1; col < messagePict.getWidth(); col+=2) {
				currPixel = currPixels[row][col];
				messagePixel = messagePixels[row][col];
				if (messagePixel.colorDistance(Color.BLACK) < 50) {
					leftPixel = currPixels[row][col - 1];
					currPixel.setColor(leftPixel.getColor());
				}
			}
		}
	}

	/*
	 * for (int row = 0; row < messagePict.getHeight(); row++) { for (int col =
	 * 0; col < messagePict.getWidth(); col++) { currPixel =
	 * currPixels[row][col]; messagePixel = messagePixels[row][col]; if
	 * (messagePixel.colorDistance(Color.BLACK) < 50) { rightPixel =
	 * currPixels[row][col + 1]; currPixel.setColor(rightPixel.getColor()); } }
	 * }
	 */
	

	/**
	 * Method to decode a message hidden in the red value of the current picture
	 * 
	 * @return the picture with the hidden message
	 */
	/*
	 * public Picture decode() { Pixel[][] pixels = this.getPixels2D(); int
	 * height = this.getHeight(); int width = this.getWidth(); Pixel currPixel =
	 * null;
	 * 
	 * Pixel messagePixel = null; Picture messagePicture = new Picture(height,
	 * width); Pixel[][] messagePixels = messagePicture.getPixels2D(); int count
	 * = 0; for (int row = 0; row < this.getHeight(); row++) { for (int col = 0;
	 * col < this.getWidth(); col++) { currPixel = pixels[row][col];
	 * messagePixel = messagePixels[row][col]; if (currPixel.getRed() % 2 == 1)
	 * { messagePixel.setColor(Color.BLACK); count++; } } }
	 * System.out.println(count); return messagePicture; }
	 */
	public Picture decode() {
		Pixel[][] pixels = this.getPixels2D();
		int height = this.getHeight();
		int width = this.getWidth();
		Pixel currPixel = null;
		Pixel leftPixel = null;
		Pixel messagePixel = null;
		Picture messagePicture = new Picture(height, width);
		Pixel[][] messagePixels = messagePicture.getPixels2D();
		for (int row = 0; row < this.getHeight(); row++) {
			for (int col = 1; col < this.getWidth() - 1; col++) {
				currPixel = pixels[row][col];
				leftPixel = pixels[row][col - 1];
				messagePixel = messagePixels[row][col];
				if (currPixel.equals(leftPixel)) {
					messagePixel.setColor(Color.BLACK);
					// messagePixels[row][col + 1].setColor(Color.BLACK);
				}
			}
		}
		return messagePicture;
	}

	/*
	 * Main method for testing - each class in Java can have a main method
	 */
	public static void main(String[] args) {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}

} // this } is the end of class Picture, put all new methods before this