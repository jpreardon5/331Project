import java.awt.Graphics;
import java.awt.Point;

/**
 * 
 */

/**
 * @author Chapp Brown
 *
 */
public abstract class StaticScreenObject extends ScreenObjects {
	/**
	 * 
	 */
	public StaticScreenObject(Point location, int height, int width){
		super(location,height,width);
	}
	
	public StaticScreenObject(int x, int y, int height, int width) {
		super(x,y,height,width);
	}
	public abstract void draw(Graphics g);
	
	
	
}
