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
	public StaticScreenObject(Point location) {
		super(location);
	}
	public StaticScreenObject(int x, int y){
		super(x,y);
	}
	public StaticScreenObject(Point location, int length, int width){
		super(location,length,width);
	}
	
	public abstract void draw(Graphics g);
	
	
	
}
