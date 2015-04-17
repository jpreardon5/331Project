import java.awt.Graphics;
import java.awt.Point;

/**
 * 
 */

/**
 * @author Chapp Brown
 *
 */
public abstract class ScreenObjects {
	Point location;
	int length;
	int width;
	
	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	public ScreenObjects(Point location){
		this.location=location;
	}
	public ScreenObjects(int x, int y){
		location = new Point(x,y);
	}
	public ScreenObjects(Point location, int length, int width){
		this.location = location;
		this.length = length;
		this.width = width;
	}
	/**
	 * @return the location
	 */
	public Point getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(Point location) {
		this.location = location;
	}
	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}
	/**
	 * @param length the length to set
	 * @param width the width to set
	 */
	public void setSize(int length, int width){
		this.length = length;
		this.width = width;
	}
	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}
	/**
	 * @param x X-value of upper-left corner
	 * @param y Y-value of upper-left corner
	 */
	public void setLocation(int x, int y){
		location = new Point(x,y);
		
	}
	public abstract void draw(Graphics g);
	
}
