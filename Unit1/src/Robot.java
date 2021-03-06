//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);  	
      setVisible(true);
   }
   
   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      //call head method
      head(window);
      //call other methods
      upperBody(window);
      lowerBody(window);
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);

      window.fillOval(300, 100, 200, 100);
      window.setColor(Color.GREEN);
      window.fillOval(340, 130, 20, 20);
      window.fillOval(440, 130, 20, 20);
      window.setColor(Color.BLACK);
      window.fillOval(390, 150, 20, 10);
      window.setColor(Color.RED);
      window.drawArc(350, 145, 100, 40, -180, 180);
   }

   public void upperBody( Graphics window )
   {
	   window.setColor(Color.BLACK);
	   window.drawLine(240, 160, 340, 220);
	   window.drawLine(560, 160, 460, 220);
	   window.setColor(Color.BLUE);
	   window.fillRect(340, 220, 120, 120);
   }

   public void lowerBody( Graphics window )
   {
	   window.setColor(Color.GRAY);
	   window.fillRect(340, 355, 120, 100);
	   window.setColor(Color.BLACK);
	   window.drawLine(240, 550, 340, 455);
	   window.drawLine(560, 550, 460, 455);
   }
}