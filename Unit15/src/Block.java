
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable {
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block() {
		setPos(0,0);
		setDimensions(0,0);
		setColor(Color.black);
	}

	// add other Block constructors - x , y , width, height, color
	public Block(int x, int y) {
		setPos(x, y);
		setDimensions(0,0);
		setColor(Color.BLACK);
	}
	
	public Block(int x, int y, int width, int height) {
		setPos(x,y);
		setDimensions(width, height);
		setColor(Color.black);
	}
	
	public Block(int x, int y, int width, int height, Color color) {
		setPos(x,y);
		setDimensions(width, height);
		setColor(color);
	}

	// add the other set methods
	public void setColor(Color col) {
		color = col;
	}

	@Override
	public void setPos(int x, int y) {
		setX(x);
		setY(y);
	}

	@Override
	public void setX(int x) {
		xPos = x;
	}

	@Override
	public void setY(int y) {
		yPos = y;
	}
	
	public void setDimensions(int w, int h) {
		setWidth(w);
		setHeight(h);
	}
	
	public void setWidth(int w) {
		width = w;
	}
	
	public void setHeight(int h) {
		height = h;
	}

	public void draw(Graphics window) {
		// uncomment after you write the set and get methods
		window.setColor(color);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public void draw(Graphics window, Color col) {
		window.setColor(col);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public boolean equals(Object obj) {
		Block b = (Block)obj;
		return getX() == b.getX() && getY() == b.getY() && getWidth() == b.getWidth()
				&& getHeight() == b.getHeight() && getColor().equals(b.getColor());
	}

	@Override
	public int getX() {
		return xPos;
	}

	@Override
	public int getY() {
		return yPos;
	}
	
	// add the other get methods
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public Color getColor() {
		return color;
	}

	// add a toString() method - x , y , width, height, color
	public String toString() {
		return getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor();
	}
}