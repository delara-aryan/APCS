
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block {
	// instance variables
	private int speed;

	public Paddle() {
		super(10, 10);
		speed = 5;
	}

	// add the other Paddle constructors
	public Paddle(int x, int y) {
		super(x, y);
		speed = 5;
	}
	
	public Paddle(int x, int y, int s) {
		super(x, y);
		speed = s;
	}
	
	public Paddle(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 5;
	}
	
	public Paddle(int x, int y, int width, int height, Color color) {
		super(x, y, width, height, color);
		speed = 5;
	}
	
	public Paddle(int x, int y, int width, int height, int s) {
		super(x, y, width, height);
		speed = s;
	}
	
	public Paddle(int x, int y, int width, int height, Color color, int s) {
		super(x, y, width, height, color);
		speed = s;
	}

	public void moveUpAndDraw(Graphics window) {
		window.setColor(Color.WHITE);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
		setY(getY() - getSpeed());
		window.setColor(getColor());
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public void moveDownAndDraw(Graphics window) {
		window.setColor(Color.WHITE);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
		setY(getY() + getSpeed());
		window.setColor(getColor());
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	// add get methods
	public int getSpeed() {
		return speed;
	}

	// add a toString() method
	public String toString() {
		return super.toString() + " " + getSpeed(); 
	}
}