import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 */

/**
 * @author Chapp Brown
 *
 */
public class BezerkWindow extends JFrame{

	/**
	 * @param args
	 */
	private final int window_ht = 500;
	private final int window_width = 500;
	
	
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		BezerkWindow bezerk = new BezerkWindow();

	}
	
	public BezerkWindow(){
		setSize(window_width, window_ht);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		JPanel screen = new JPanel();
		screen.setPreferredSize(new Dimension(window_ht,window_width));
		screen.setBackground(Color.BLACK);
		contentPane.add(screen);
		setVisible(true);
		
		
	}
		
	}

