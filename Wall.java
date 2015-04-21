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

	/**
	 * @param location
	 * @param height
	 * @param width
	 */
	public Wall(Point location, int height, int width) {
		super(location, height, width);
		// TODO Auto-generated constructor stub
	}
	public Wall(int x, int y,int height, int width){
		super(x,y,height,width);
	}

	/* (non-Javadoc)
	 * @see StaticScreenObject#draw(java.awt.Graphics)
	 */
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLUE);
		int x = (int)location.getX();
		int y = (int)location.getY();
		g.fillRect(x,y,height,width);
		
	}

}

