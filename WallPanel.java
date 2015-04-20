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
		g.setColor(Color.BLUE);
		g.fillRect(10, 10, 7, 325);   //left wall
		g.fillRect(560,10,7,325);		//right wall
		g.fillRect(10, 10,225,7);		//top-left
		g.fillRect(345, 10, 218, 7);	//top-right
		g.fillRect(10, 330, 225, 7);	//b-left
		g.fillRect(345,330,222,7);		//b-right
		g.fillRect(110,110,7,125);		//left wall of I
		g.fillRect(110,172,350,7);		//rt wall
		g.fillRect(460, 110, 7, 125);	//middle wall of I
		

		
	}

}
