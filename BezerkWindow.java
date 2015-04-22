import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
		
		//You will have to change the directory for this to work.
		//Easiest way to attack images is to labels.
		JLabel introScreen=new JLabel(new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/title_screen.png"));
		JLabel loadUpOne= new JLabel(new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/loadUpOne.png"));
		URL url;
		//Adds black screen, then resizes for next.
		contentPane.add(screen);
		setSize(800,600);
		contentPane.add(loadUpOne);
		setVisible(true);
		setResizable(false);
		//Plays Audio, Only works for .wav format. All clips are in .wav.
		   try {
		        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:/Users/taylor/Desktop/workspace2/Berzerk/psOne.wav"));
		        Clip clip = AudioSystem.getClip();
		        clip.open(audioInputStream);
		        clip.start();
		    } catch(Exception ex) {
		        System.out.println("Error with playing sound.");
		        ex.printStackTrace();
		    }
		 //Creates a sleep(), timer till next screen.
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//Removes previous screen and resizes for next then places.
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
		//Creates a sleep(), timer till next screen.
				try {
					TimeUnit.SECONDS.sleep(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		//Takes it to the game window.
		contentPane.removeAll();
		contentPane.add(introScreen);
		setVisible(true);
		//Creates a sleep(), timer till next screen.
				try {
					TimeUnit.SECONDS.sleep(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		contentPane.remove(introScreen);
		double moveLeft=-12.5;
	    double moveRight=12.5;
	    double moveUpY=-12.5;
	    double moveDownY=12.5;
	    int xStart=50;
	    int yStart=250;
	    boolean r1Dead=false;
	    boolean r2Dead=false;
	    boolean r3Dead=false;
	   
	   JLabel otto=new JLabel(new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/evilOttoRed.png"));
	   JLabel robot1=new JLabel(new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/robotStandingStill.png"));
	   JLabel robot2=new JLabel(new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/robotStandingStill.png"));
	   JLabel robot3=new JLabel(new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/robotStandingStill.png"));
       JLabel stickManOne=new JLabel(new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/stickmanLookingEast.png"));
       JLabel bullet=new JLabel("C:/Users/taylor/Desktop/workspace2/Berzerk/bulletNorthSouth.png");
       JLabel bullet2=new JLabel("C:/Users/taylor/Desktop/workspace2/Berzerk/bulletEastWest.png");
       JLabel life=new JLabel(new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/Life.png"));
       JLabel lifeTwo=new JLabel(new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/Life.png"));
       JLabel lifeThree=new JLabel(new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/Life.png"));
       
       //Jlabel icon switches.
       ImageIcon robotGoingEast;
       ImageIcon robotGoingNorth;
       ImageIcon robotStandingStill;
       ImageIcon bulletNorthSouth;
       ImageIcon bulletEastWest;
       ImageIcon stickmanRunningWest;
       ImageIcon stickmanLookingWest;
       ImageIcon stickmanRunningEast;
       ImageIcon stickmanLookingEast;
       ImageIcon explosionGif;
      
       
       
       explosionGif=new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/explosion.gif");
    
       stickmanLookingEast=new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/stickmanLookingEast.png");
	   stickmanRunningEast=new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/stickmanRunningEast.png");
       stickmanLookingWest=new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/stickmanLookingWest.png");
	   stickmanRunningWest=new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/stickmanRunningWest.png");
       bulletEastWest=new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/bulletEastWest.png");
	   bulletNorthSouth=new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/bulletNorthSouth.png");
       robotGoingEast=new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/robotGoingEast.png");
       robotGoingNorth=new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/robotGoingNorth.png");
       robotStandingStill=new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/robotStandingStill.png");
       
	   
       JPanel gamePanel=new JPanel();
       gamePanel.setBackground(Color.BLACK);
       gamePanel.setLayout(null);
       contentPane.add(gamePanel);
       setVisible(true);
      
       //Sets Size of icons.(values come from dimensions of picture)
       stickManOne.setSize(51,62);
       bullet.setSize(17,33);
       bullet2.setSize(34,15);
       life.setSize(58,51);
       lifeTwo.setSize(58,51);
       lifeThree.setSize(58,51);
       robot1.setSize(60,84);
       robot2.setSize(60,84);
       robot3.setSize(60,84);
       otto.setSize(73,40);
       
       //Adds them to the game display panel
       gamePanel.add(stickManOne);
       gamePanel.add(bullet);
       gamePanel.add(bullet2);
       gamePanel.add(life);
       gamePanel.add(lifeTwo);
       gamePanel.add(lifeThree);
       gamePanel.add(robot1);
       gamePanel.add(robot2);
       gamePanel.add(robot3);
       gamePanel.add(otto);

       //Sets the location for the icons.
       life.setLocation(25,500);
       lifeTwo.setLocation(83,500);
       lifeThree.setLocation(141,500);
       stickManOne.setLocation(xStart, yStart);
       robot1.setLocation(xStart+67,yStart);
       robot2.setLocation(xStart+134,yStart);
       robot3.setLocation(xStart+201,yStart);
       
       
       //ALL THE CORDINATES Muahahah
       int x=stickManOne.getX();
       int y=stickManOne.getY();
       int rx1=robot1.getX();
 	   int ry1=robot1.getY();
 	   int rx2=robot2.getX();
 	   int ry2=robot2.getY();
 	   int rx3=robot3.getX();
 	   int ry3=robot3.getY();
 	   int b2x1=bullet2.getX();
 	   int b2y1=bullet2.getY();
       int ox1=otto.getX();
       int oy1=otto.getY();
       
     //Plays Audio, Only works for .wav format. All clips are in .wav.
	   try {
	        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:/Users/taylor/Desktop/workspace2/Berzerk/b-alert.wav"));
	        Clip clip = AudioSystem.getClip();
	        clip.open(audioInputStream);
	        clip.start();
	    } catch(Exception ex) {
	        System.out.println("Error with playing sound.");
	        ex.printStackTrace();
	    }
       
	   //test move east
       for(int i=0; i <5;i++){
    	   try {
				TimeUnit.MILLISECONDS.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	   xStart+=moveRight;
    	   stickManOne.setIcon(stickmanRunningEast);
    	   stickManOne.setLocation(xStart,yStart);
    	   //testing robot movement. Do the Boogie Woogie.
    	   robot1.setIcon(robotGoingEast);
    	   robot1.setLocation(xStart+67, yStart);
    	   robot2.setIcon(robotGoingEast);
    	   robot2.setLocation(xStart+134, yStart);
    	   robot3.setIcon(robotGoingEast);
    	   robot3.setLocation(xStart+201, yStart);
       }
       stickManOne.setIcon(stickmanLookingEast);
       robot1.setIcon(robotStandingStill);
       robot2.setIcon(robotStandingStill);
       robot3.setIcon(robotStandingStill);
       
       //test move west
       for(int i=0; i <5;i++){
    	   try {
				TimeUnit.MILLISECONDS.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	   xStart+=moveLeft;
    	   stickManOne.setIcon(stickmanRunningWest);
    	   stickManOne.setLocation(xStart,yStart);
       }
       stickManOne.setIcon(stickmanLookingWest);
       
       //test move north
       for(int i=0; i <5;i++){
    	   try {
				TimeUnit.MILLISECONDS.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	   yStart+=moveUpY;
    	   stickManOne.setIcon(stickmanRunningEast);
    	   stickManOne.setLocation(xStart,yStart);
       }
       stickManOne.setIcon(stickmanLookingEast);
       
       //test move south
       for(int i=0; i <5;i++){
    	   try {
				TimeUnit.MILLISECONDS.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	   yStart+=moveDownY;
    	   stickManOne.setIcon(stickmanRunningWest);
    	   stickManOne.setLocation(xStart,yStart);
       }
       stickManOne.setIcon(stickmanLookingWest);
	    x=stickManOne.getX();
        y=stickManOne.getY();
       //test fire north
       for(int i=0; i <25;i++){
    	   try {
				TimeUnit.MILLISECONDS.sleep(40);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	   y+=(moveUpY/3);
    	   bullet.setIcon(bulletNorthSouth);
    	   bullet.setLocation(x,y);
       }
        x=stickManOne.getX();
        y=stickManOne.getY();
        
       //test fire south
       for(int i=0; i <50;i++){
    	   try {
				TimeUnit.MILLISECONDS.sleep(40);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	   y+=(moveDownY/3);
    	   bullet.setIcon(bulletNorthSouth);
    	   bullet.setLocation(x,y);
       }
       bullet.setVisible(false);
       x=stickManOne.getX();
       y=stickManOne.getY();
       //test fire east
       for(int i=0; i <50;i++){
    	   try {
				TimeUnit.MILLISECONDS.sleep(40);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	   rx1=robot1.getX();
    	   ry1=robot1.getY();
    	   rx2=robot2.getX();
    	   ry2=robot2.getY();
    	   rx3=robot3.getX();
    	   ry3=robot3.getY();
    	   b2x1=bullet2.getX();
    	   b2y1=bullet2.getY();
    	  
    	   if(b2x1==rx1||b2y1==ry1){
    		 //Plays Audio, Only works for .wav format. All clips are in .wav.
    		   
    		   try {
    		        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:/Users/taylor/Desktop/workspace2/Berzerk/b-dth.wav"));
    		        Clip clip = AudioSystem.getClip();
    		        clip.open(audioInputStream);
    		        clip.start();
    		    } catch(Exception ex) {
    		        System.out.println("Error with playing sound.");
    		        ex.printStackTrace();
    		    }
    		   robot1.setIcon(explosionGif);
    		   bullet2.setVisible(false);
    		   r1Dead=true;
    	   }
    		
    	   x+=(moveRight/3);
    	   bullet2.setIcon(bulletEastWest);
    	   bullet2.setLocation(x,y);
       }
       if(r1Dead){
    	   robot1.setVisible(false);
       }
       x=stickManOne.getX();
       y=stickManOne.getY();
       
       //test fire west
       for(int i=0; i <50;i++){
    	   try {
				TimeUnit.MILLISECONDS.sleep(40);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	   x+=(moveLeft/3);
    	   bullet2.setIcon(bulletEastWest);
    	   bullet2.setLocation(x,y);
    	   
       }
       bullet2.setVisible(false);
      
	}
}	
	
		
	

