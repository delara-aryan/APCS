
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block {
	private int xSpeed;
	private int ySpeed;

	public Ball() {
		super(200, 200);
		setXSpeed(3);
		setYSpeed(1);	
	}

	// add the other Ball constructors
	public Ball(int x, int y) {
		super(x, y);
		setXSpeed(3);
		setYSpeed(1);
	}
	
	public Ball(int x, int y, int width, int height) {
		super(x, y, width, height);
		setXSpeed(3);
		setYSpeed(1);
	}
	
	public Ball(int x, int y, int width, int height, Color color) {
		super(x, y, width, height, color);
		setXSpeed(3);
		setYSpeed(1);
	}
	
	public Ball(int x, int y, int width, int height, Color color, int xSpeed, int ySpeed) {
		super(x, y, width, height, color);
		setXSpeed(xSpeed);
		setYSpeed(ySpeed);
	}

	// add the set methods
	public void setXSpeed(int xs) {
		xSpeed = xs;
	}
	
	public void setYSpeed(int ys) {
		ySpeed = ys;
	}

	public void moveAndDraw(Graphics window) {
		// draw a white ball at old ball location
		window.setColor(Color.WHITE);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
		setX(getX() + xSpeed);
		// setY
		setY(getY() + ySpeed);
		// draw the ball at its new location
		window.setColor(getColor());
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public boolean equals(Object obj) {
		Ball b = (Ball)obj;
		return super.equals(obj) && getXSpeed() == b.getXSpeed() && getYSpeed() == b.getYSpeed();
	}

	// add the get methods
	public int getXSpeed() {
		return xSpeed;
	}
	
	public int getYSpeed() {
		return ySpeed;
	}

	// add a toString() method
	public String toString() {
		return super.toString() + " " + getXSpeed() + " " + getYSpeed();
	}
}