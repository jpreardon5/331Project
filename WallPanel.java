import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * 
 */

/**
 * @author Chapp Brown
 *
 */
public class WallPanel extends JPanel{
	private final int window_ht = 450;
	private final int window_width = 600;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
	public void ScreenPanel(){
		JPanel screen = new JPanel();
		screen.setPreferredSize(new Dimension(window_ht,window_width));
		screen.setBackground(Color.BLACK);
	}
	public void paintComponent (Graphics g){
	super.paintComponent(g);
		Wall wall1 = new Wall(new Point(0,0));
		wall1.draw(g);
		

		
	}

}
