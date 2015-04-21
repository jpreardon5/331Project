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
		//You will have to change the directory for this to work.-Taylor
		//Easiest way to attack images is to labels.-Taylor
		JLabel introScreen=new JLabel(new ImageIcon("F:/UNCW classes/code/CSC331/331Project-master/331 project/title_screen.png"));
		JLabel loadUpOne= new JLabel(new ImageIcon("F:/UNCW classes/code/CSC331/331Project-master/331 project/loadUpOne.png"));
		URL url;
		//Adds black screen, then resizes for next.-Taylor
		contentPane.add(screen);
		setSize(500,328);
		contentPane.add(loadUpOne);
		setVisible(true);
		//Plays Audio, Only works for .wav format. All clips are in .wav.-Taylor
		   try {
		        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("F:/UNCW classes/code/CSC331/331Project-master/331 project/psOne.wav"));
		        Clip clip = AudioSystem.getClip();
		        clip.open(audioInputStream);
		        clip.start();
		    } catch(Exception ex) {
		        System.out.println("Error with playing sound.");
		        ex.printStackTrace();
		    }
		//Creates a sleep(), timer till next screen.-Taylor
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Removes previous screen and resizes for next then places.-Taylor
		try {
			url = new URL("http://33.media.tumblr.com/439a4606156abed8c2d04944d4efd12f/tumblr_njzfrmm6PG1qfcqfoo1_1280.gif");
			Icon icon = new ImageIcon(url);
		    JLabel label = new JLabel(icon);
		    contentPane.remove(loadUpOne);
		    setSize(800,600);
		    contentPane.add(label);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Creates a sleep(), timer till next screen.-Taylor
				try {
					TimeUnit.SECONDS.sleep(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		//Takes it to the game window. -Taylor
		contentPane.removeAll();
		contentPane.add(introScreen);
		setVisible(true);//Creates a sleep(), timer till next screen.
				try {
					TimeUnit.SECONDS.sleep(0);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		contentPane.remove(introScreen);
		double moveLeft=-13.5;
	    double moveRight=13.5;
	    double moveUpY=-13.5;
	    double moveDowny=13.5;
	    int xStart=50;
	    int yStart=250;
       JLabel stickManOne=new JLabel(new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/stickmanLookingEast.png"));
       JPanel gamePanel=new JPanel();
       gamePanel.setBackground(Color.BLACK);
       gamePanel.setLayout(null);
       contentPane.add(gamePanel);
       setVisible(true);
       int x=stickManOne.getX();
       int y=stickManOne.getY();
       System.out.println(x+" "+y);
       stickManOne.setLocation(xStart, yStart);
       gamePanel.add(stickManOne);
       stickManOne.setSize(51,71);
       JLabel life=new JLabel(new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/Life.png"));
       JLabel lifeTwo=new JLabel(new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/Life.png"));
       JLabel lifeThree=new JLabel(new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/Life.png"));
       gamePanel.add(life);
       gamePanel.add(lifeTwo);
       gamePanel.add(lifeThree);
       life.setLocation(25,500);
       life.setSize(58,51);
       lifeTwo.setLocation(75,500);
       lifeTwo.setSize(58,51);
       lifeThree.setLocation(125,500);
       lifeThree.setSize(58,51);
       
       setVisible(true);
       
       
       
       for(int i=0; i <5;i++){
    	   try {
				TimeUnit.MILLISECONDS.sleep(333);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	   xStart+=moveRight;
    	  
    	   stickManOne.setLocation(xStart,yStart);
       }
	}
		
		
	}
