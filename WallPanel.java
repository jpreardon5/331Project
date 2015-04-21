import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

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
	private ArrayList<ScreenObjects> screenObjects = new ArrayList<ScreenObjects>();
	
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
	@Override
	public void paintComponent (Graphics g){
		super.paintComponent(g);
		Wall wall1 = new Wall(10, 10, 10, 500);   //left wall
		Wall wall2 = new Wall(760,10,10,500);		//right wall
		Wall wall3 = new Wall(10, 10,310,10);		//top-left
		Wall wall4 = new Wall(450, 10, 310, 10);	//top-right
		Wall wall5 = new Wall(10, 500, 310, 10);	//b-left
		Wall wall6 = new Wall(450,500,310,10);		//b-right
		Wall wall7 = new Wall(135,160,10,200);		//left wall of I
		Wall wall8 = new Wall(635,160,10,200);		//rt wall
		Wall wall9 = new Wall(135,255,500,10);		//middle wall of I
		screenObjects.add(wall1);
		screenObjects.add(wall2);
		screenObjects.add(wall3);
		screenObjects.add(wall4);
		screenObjects.add(wall5);
		screenObjects.add(wall6);
		screenObjects.add(wall7);
		screenObjects.add(wall8);
		screenObjects.add(wall9);
		for (int i = 0; i < screenObjects.size(); i++){
			screenObjects.get(i).draw(g);
			
		}
		
		

		
	}

}
