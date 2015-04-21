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
	int height;
	int width;
	
	/**
	 * @param height the height to set
	 */
	public void setLength(int height) {
		this.height = height;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	public ScreenObjects(Point location, int height, int width){
		this.location = location;
		this.height = height;
		this.width = width;
	}
	public ScreenObjects(int x, int y, int height, int width){
		this.location = new Point(x,y);
		this.height = height;
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
	 * @return the height
	 */
	public int getLength() {
		return height;
	}
	/**
	 * @param height the height to set
	 * @param width the width to set
	 */
	public void setSize(int height, int width){
		this.height = height;
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
