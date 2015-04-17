import java.awt.Graphics;
import java.awt.Point;

/**
 * 
 */

/**
 * @author Chapp Brown
 *
 */
public abstract class MovingScreenObject extends ScreenObjects {
	double speed;
	/**
	 * 
	 */
	public MovingScreenObject(Point location) {
		super(location);
	}
	public MovingScreenObject(int x, int y) {
		super(x,y);
	}
	public MovingScreenObject(Point location, int length, int width){
		super(location,length,width);
	}
	/**
	 * @return the speed
	 */
	public double getSpeed() {
		return speed;
	}
	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public abstract void collide();
	
	public abstract void draw(Graphics g);
	
	public abstract void move();

}
