import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 * 
 */

/**
 * @author Chapp Brown
 *
 */
public class Wall extends StaticScreenObject {

	/**
	 * @param location
	 */
	public Wall(Point location) {
		super(location);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param x
	 * @param y
	 */
	public Wall(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param location
	 * @param length
	 * @param width
	 */
	public Wall(Point location, int length, int width) {
		super(location, length, width);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see StaticScreenObject#draw(java.awt.Graphics)
	 */
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(10, 10, 10, 500);   //left wall
		g.fillRect(760,10,10,500);		//right wall
		g.fillRect(10, 10,310,10);		//top-left
		g.fillRect(450, 10, 310, 10);	//top-right
		g.fillRect(10, 500, 310, 10);	//b-left
		g.fillRect(450,500,310,10);		//b-right
		g.fillRect(135,160,10,200);		//left wall of I
		g.fillRect(635,160,10,200);		//rt wall
		g.fillRect(135,255,500,10);	//middle wall of I
		
	}

}
