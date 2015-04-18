import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * @author JPR
 *
 */
public class Screen extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static int screenWidth = 500;
	public static int screenHeight = 500;
	
	public Screen() {
		setPreferredSize(new Dimension(screenWidth, screenHeight));
		setBackground(Color.black);
		
	}
	public void paintComponent(Graphics g) {
		screenWidth = this.getWidth();
		screenHeight = this.getHeight();
		super.paintComponent(g);
		
		repaint();
	}

}

