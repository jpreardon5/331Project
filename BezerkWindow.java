
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.MediaTracker;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author Chapp Brown
 *
 */
	
	public class BezerkWindow extends JFrame implements KeyListener{

		/**
		 * @param args
		 */
		private final int window_ht = 500;
		private final int window_width = 500;
		private javax.swing.Timer timer;
	 	int xDest = 50;
	 	int yDest = 250;
	    double xMove = 0;
	    double yMove = 0;
	    JLabel stickManOne;
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
	   WallPanel gamePanel;
	   double moveLeft=-12.5;
	    double moveRight=12.5;
	    double moveUpY=-12.5;
	    double moveDownY=12.5;
	    JLabel bullet;
	   JLabel bullet1;
	   JLabel bullet2;
	   JLabel bullet3;
	   Point bulletvect;
	   Point bulletvect1 = new Point(0,0);
	   Point bulletvect2 = new Point(0,0);
	   Point bulletvect3 = new Point(0,0);
	   JLabel otto;
	   JLabel robot1;
	   JLabel robot2;
	   JLabel robot3;
	   int robo1changex;
	   int robo2changex;
	   int robo3changex;
	   int count = 0;
	   JLabel lifeThree;
	   JLabel lifeTwo;
	   JLabel life;
	   JLabel explosion;
	   int xStart=50;
	   int yStart=260;
		
		
		
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
			timer = new javax.swing.Timer(45, new TimerListener());
			//You will have to change the directory for this to work.
			//Easiest way to attack images is to labels.
			JLabel introScreen=new JLabel(new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/title_screen.png"));
			JLabel loadUpOne= new JLabel(new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/loadUpOne.png"));
			
			JLabel loading=new JLabel(new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/Loading.gif"));
			//Adds black screen, then resizes for next.
			contentPane.add(screen);
			setSize(800,600);
			contentPane.add(loadUpOne);
			setVisible(true);
			setResizable(false);
			//Plays Audio, Only works for .wav format. All clips are in .wav.
//			   try {
//			        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:/Users/taylor/Desktop/workspace2/Berzerk//psOne.wav"));
//			        Clip clip = AudioSystem.getClip();
//			        clip.open(audioInputStream);
//			        clip.start();
//			    } catch(Exception ex) {
//			        System.out.println("Error with playing sound.");
//			        ex.printStackTrace();
//			    }
			 //Creates a sleep(), timer till next screen.
				try {
					TimeUnit.SECONDS.sleep(0);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			//Removes previous screen and resizes for next then places.
			
			    contentPane.remove(loadUpOne);
			    setSize(800,600);
			    contentPane.add(loading);
			    setVisible(true);
			//Creates a sleep(), timer till next screen.
					try {
						TimeUnit.SECONDS.sleep(0);
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
						TimeUnit.SECONDS.sleep(0);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			
			contentPane.remove(introScreen);
		    boolean r1Dead=false;
		    boolean r2Dead=false;
		    boolean r3Dead=false;
		    
		   otto=new JLabel(new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/evilOttoRed.png"));
		   robot1=new JLabel(new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/robotStandingStill.png"));
		   robot2=new JLabel(new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/robotStandingStill.png"));
		   robot3=new JLabel(new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/robotStandingStill.png"));
	       stickManOne=new JLabel(new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/stickmanLookingEast.png"));
	       bullet=new JLabel("C:/Users/taylor/Desktop/workspace2/Berzerk/bulletNorthSouth.png");
	       bullet1=new JLabel("C:/Users/taylor/Desktop/workspace2/Berzerk/bulletEastWest.png");
	       bullet2=new JLabel("C:/Users/taylor/Desktop/workspace2/Berzerk/bulletEastWest.png");
	       bullet3=new JLabel("C:/Users/taylor/Desktop/workspace2/Berzerk/bulletEastWest.png");
	       life=new JLabel(new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/Life.png"));
	       lifeTwo=new JLabel(new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/Life.png"));
	       lifeThree=new JLabel(new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/Life.png"));
	       explosion = new JLabel(new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/explosion.gif"));
	       //Jlabel icon switches.
	      
	       bullet1.setVisible(false);
	       bullet2.setVisible(false);
	       bullet3.setVisible(false);
	      
	       robo1changex = 2;
	       robo2changex = 2;
	       robo3changex = 2;
	       
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
	       
		   
	       gamePanel=new WallPanel();
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
	       bullet.setLocation(0,0);
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
	       robot1.setLocation(xStart+357,yStart+70);
	       robot2.setLocation(xStart+454,yStart+130);
	       robot3.setLocation(xStart+361,yStart-140);
	       
	       
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
//		   try {
//		        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:/Users/taylor/Desktop/workspace2/Berzerk/ALERT.wav"));
//		        Clip clip = AudioSystem.getClip();
//		        clip.open(audioInputStream);
//		        clip.start();
//		    } catch(Exception ex) {
//		        System.out.println("Error with playing sound.");
//		        ex.printStackTrace();
//		    }
	       this.addKeyListener(this);
		   bullet.setVisible(false);
		   bullet1.setVisible(false);
		   bullet2.setVisible(false);
		   bullet3.setVisible(false);
		   timer.start();
//		  
//	    	  
//	    	   if(b2x1==rx1||b2y1==ry1){
//	    		 //Plays Audio, Only works for .wav format. All clips are in .wav.
//	    		   
//	    		   try {
//	    		        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:/Users/taylor/Desktop/workspace2/Berzerk/DTH.wav"));
//	    		        Clip clip = AudioSystem.getClip();
//	    		        clip.open(audioInputStream);
//	    		        clip.start();
//	    		    } catch(Exception ex) {
//	    		        System.out.println("Error with playing sound.");
//	    		        ex.printStackTrace();
//	    		    }
//	    		   robot1.setIcon(explosionGif);
//	    		   bullet2.setVisible(false);
//	    		   r1Dead=true;
//	    	   }
//	    		
//	       if(r1Dead){
//	    	   robot1.setVisible(false);
		}
		public void restart(){
			
			stickManOne.setIcon(stickmanLookingEast);
			
//			try{
//				wait(2000);	
//			}
//			catch (Exception e){
//				e.printStackTrace();
//			}
//			try{
//				TimeUnit.SECONDS.sleep(2);
//			}
//			catch (Exception er){
//				er.printStackTrace();
//			}
			if (!lifeThree.isVisible() && !lifeTwo.isVisible() && life.isVisible()) life.setVisible(false);
			if (!lifeThree.isVisible() && lifeTwo.isVisible()) lifeTwo.setVisible(false);
			if (lifeThree.isVisible()) lifeThree.setVisible(false);
			if(!lifeThree.isVisible()&&!lifeTwo.isVisible()&&!life.isVisible()){
				JLabel gameOver= new JLabel(new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/gameOver.gif"));
				robot1.setVisible(false);
				robot2.setVisible(false);
				robot3.setVisible(false);
				stickManOne.setVisible(false);
				gameOver.setSize(800,600);
				
				gamePanel.add(gameOver);
				
			}
//			stickManOne.setIcon(stickmanLookingEast);
			stickManOne.setLocation(xStart,yStart);
			stickManOne.setVisible(true);
		
				
		}
		private class TimerListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent arg0) {
			Random rand = new Random();
			int bulletx = bullet.getX();
			int bullety = bullet.getY();	
			if (bullet.isVisible()){
				bulletx = (int) (bulletx + bulletvect.getX());
				bullety = (int) (bullety + bulletvect.getY());
				bullet.setLocation(bulletx,bullety);
				if (bulletx > 800 || bulletx < 0 || bullety > 600 || bullety < 0) bullet.setVisible(false);
				if (bulletx > 10 && bulletx < 10 + 5 && bullety > 10 && bullety < 10+500) bullet.setVisible(false);
				if (bulletx > 760 && bulletx < 760 + 10 && bullety > 10 && bullety < 10+500) bullet.setVisible(false);
				if (bulletx > 10 && bulletx < 10 + 310 && bullety > 10 && bullety < 10+10) bullet.setVisible(false);
				if (bulletx > 450 && bulletx < 450 + 310 && bullety > 10 && bullety < 10+10) bullet.setVisible(false);
				if (bulletx > 10 && bulletx < 10 + 310 && bullety > 500 && bullety < 500+10) bullet.setVisible(false);
				if (bulletx > 450 && bulletx < 450 + 310 && bullety > 500 && bullety < 500+10) bullet.setVisible(false);
				if (bulletx > 135 && bulletx < 135 + 10 && bullety > 160 && bullety < 160+200) bullet.setVisible(false);
				if (bulletx > 635 && bulletx < 635 + 10 && bullety > 160 && bullety < 160+200) bullet.setVisible(false);
				if (bulletx > 135 && bulletx < 135 + 500 && bullety > 225 && bullety < 225+10) bullet.setVisible(false);
				
				
				
				
			}
//			int bullet1x = bullet1.getX();
//			int bullet1y = bullet1.getY();
//			if (bullet1.isVisible()){
//				bullet1x = (int) (bullet1x + bulletvect1.getX());
//				bullet1y = (int) (bullet1y + bulletvect1.getY());
//				bullet1.setLocation(bullet1x,bullet1y);
//				if (bullet1x > 800 || bullet1x < 0 || bullet1y > 600 || bullet1y < 0) bullet1.setVisible(false);
//				
//			}
//			int bullet2x = bullet2.getX();
//			int bullet2y = bullet2.getY();
//			if (bullet2.isVisible()){
//				bullet2x = (int) (bullet2x + bulletvect2.getX());
//				bullet2y = (int) (bullet2y + bulletvect2.getY());
//				bullet2.setLocation(bullet2x,bullet2y);
//				if (bullet2x > 800 || bullet2x < 0 || bullet2y > 600 || bullet2y < 0) bullet2.setVisible(false);
//				
//			}
//			int bullet3x = bullet3.getX();
//			int bullet3y = bullet3.getY();
//			if (bullet3.isVisible()){
//				bullet3x = (int) (bullet3x + bulletvect3.getX());
//				bullet3y = (int) (bullet3y + bulletvect3.getY());
//				bullet3.setLocation(bullet3x,bullet3y);
//				if (bullet3x > 800 || bullet3x < 0 || bullet3y > 600 || bullet3y < 0) bullet3.setVisible(false);
//				
//			}
			int stickX = stickManOne.getX();
			int stickY = stickManOne.getY();
			stickX += xMove;
			stickY += yMove;
			stickManOne.setLocation(stickX,stickY);
			int robo1x = robot1.getX();
			int robo1y = robot1.getY();
			if (robot1.isVisible()&&robot1.getIcon()!=explosionGif){
				robo1x = robo1x + robo1changex;
				robot1.setLocation(robo1x, robo1y);	
			}
			if (robot1.isVisible() && count%100 == 1){
				robo1changex = - (robo1changex);
			}
			if (stickX+25 > 10 && stickX < 10 + 5 && stickY+30 > 10 && stickY < 10+500)stickManOne.setIcon(explosionGif);
			if (stickX+25 > 760 && stickX < 760 + 10 && stickY+30 > 10 && stickY < 10+500) stickManOne.setIcon(explosionGif);
			if (stickX+25 > 310 && stickX < 450 + 10 && stickY < 10){
				JLabel win= new JLabel(new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/victory.png"));
				gamePanel.add(win);
				stickManOne.setVisible(false);
				robot1.setVisible(false);
				robot2.setVisible(false);
				robot3.setVisible(false);
				otto.setVisible(false);
				win.setSize(800,600);
			}
			if (stickX+25 > 310 && stickX < 450 + 10 && stickY >500){
				JLabel win= new JLabel(new ImageIcon("C:/Users/taylor/Desktop/workspace2/Berzerk/victory.png"));
				gamePanel.add(win);
				stickManOne.setVisible(false);
				robot1.setVisible(false);
				robot2.setVisible(false);
				robot3.setVisible(false);
				otto.setVisible(false);
				win.setSize(800,600);
				
				
			}
			int diffx=stickX-robot1.getX();
			int diffy=stickY-robot1.getY();
			if(diffx<0){
				diffx*=-1;
			}
			if(diffy<0){
				diffy*=-1;
			}
			
			int diffx2=stickX-robot2.getX();
			int diffy2=stickY-robot2.getY();
			if(diffx2<0){
				diffx2*=-1;
			}
			if(diffy2<0){
				diffy2*=-1;
			}
			
			int diffx3=stickX-robot3.getX();
			int diffy3=stickY-robot3.getY();
			if(diffx3<0){
				diffx3*=-1;
			}
			if(diffy3<0){
				diffy3*=-1;
			}
			
			if (stickX+25 > 10 && stickX < 10 + 310 && stickY+30 > 10 && stickY < 10+10) stickManOne.setIcon(explosionGif);
			if (stickX+25 > 450 && stickX < 450 + 310 && stickY+30 > 10 && stickY < 10+10)stickManOne.setIcon(explosionGif);
			if (stickX+25 > 10 && stickX < 10 + 310 && stickY+30 > 500 && stickY < 500+10) stickManOne.setIcon(explosionGif);
			if (stickX+25 > 450 && stickX < 450 + 310 && stickY+30 > 500 && stickY < 500+10) stickManOne.setIcon(explosionGif);
			if (stickX+25 > 135 && stickX < 135 + 10 && stickY+30 > 160 && stickY < 160+200) stickManOne.setIcon(explosionGif);
			if (stickX+25 > 635 && stickX < 635 + 10 && stickY+30 > 160 && stickY < 160+200) stickManOne.setIcon(explosionGif);
			if (stickX+25 > 135 && stickX < 135 + 500 && stickY+30 > 225 && stickY < 225+10) stickManOne.setIcon(explosionGif);
			if (diffx<=4&&diffy<=4){
				stickManOne.setIcon(explosionGif);
			}
			if (diffx2<=4&&diffy2<=4){
				stickManOne.setIcon(explosionGif);
			}
			if (diffx3<=4&&diffy3<=4){
				stickManOne.setIcon(explosionGif);
			}
			//not working
//			if (robot1.isVisible() && !bullet1.isVisible()){
//				bullet1.setLocation(robo1x,robo1y);
//				bullet1.setIcon(bulletEastWest);
//				bullet1.setVisible(true);
//				if (robo1x - stickX > 0)bulletvect1 = new Point(-12,0);
//				else bulletvect1 = new Point(12,0);	
//			}
			
			if (bulletx <= robo1x+60 && bulletx >= robo1x && bullety <= robo1y+84 && bullety>= robo1y){
				robot1.setIcon(explosionGif);
				bullet.setVisible(false);
				//robot1.setLocation(0,0);
			}
			int robo2x = robot2.getX();
			int robo2y = robot2.getY();
			if (robot2.isVisible()&&robot2.getIcon()!=explosionGif){
				robo2x = robo2x + robo2changex;
				robot2.setLocation(robo2x, robo2y);	
			}
			if (robot2.isVisible() && count%180 == 1){
				robo2changex = - (robo2changex);
			}
			
			if (bulletx <= robo2x+60 && bulletx >= robo2x && bullety <= robo2y+84 && bullety>= robo2y){
				robot2.setIcon(explosionGif);
				bullet.setVisible(false);
				//robot2.setLocation(0,0);
			}	
			int robo3x = robot3.getX();
			int robo3y = robot3.getY();
			if (robot3.isVisible()&&robot3.getIcon()!=explosionGif){
				robo3x = robo3x + robo3changex;
				robot3.setLocation(robo3x, robo3y);	
			}
			if (robot3.isVisible() && count%130 == 1){
				robo3changex = - (robo3changex);
			}
			
			if (bulletx <= robo3x+60 && bulletx >= robo3x && bullety <= robo3y+84 && bullety>= robo3y){
				robot3.setIcon(explosionGif);
				bullet.setVisible(false);
				//robot3.setLocation(0,0);
			}
			count ++;
			if ((!robot1.isVisible() && !robot2.isVisible() && !robot3.isVisible()) || count >= 750){
				int ottoX = otto.getX();
			int ottoY = otto.getY();
				double changex1 = (stickX - ottoX) / 70;
				double changey1 = (stickY - ottoY) / 70;
				if (changex1 == 0) changex1 = (stickX - ottoX) / 2;
				if (changey1 == 0) changey1 = (stickX - ottoX) / 2;
				if (changex1 == 0) changex1 = (stickX - ottoX);
			if (changey1 == 0) changey1 = (stickX - ottoX);
			int changex = (int)changex1;
				int changey = (int)changey1;
				ottoX += changex;
				ottoY += changey;
				otto.setLocation(ottoX, ottoY);
				if (ottoX >= stickX && ottoX <= stickX + 51 && ottoY >= stickY && ottoY <= stickY + 61) restart();
			}
			}
				
			}
		
			
		
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			int code=e.getKeyCode();
			//UP KEY
			if(code==KeyEvent.VK_UP&&stickManOne.getIcon()!=explosionGif){
				stickManOne.setIcon(stickmanRunningEast);
				yMove = -4.5; 
		    	 
			}
			//DOWN KEY
			if(code==KeyEvent.VK_DOWN&&stickManOne.getIcon()!=explosionGif){
				stickManOne.setIcon(stickmanRunningWest);
				   yMove = 4.5;
			}
			//LEFT KEY
					if(code==KeyEvent.VK_LEFT&&stickManOne.getIcon()!=explosionGif){
						stickManOne.setIcon(stickmanRunningWest);
						   xMove = -4.5;
					}
			//LEFT KEY
			if(code==KeyEvent.VK_RIGHT&&stickManOne.getIcon()!=explosionGif){
						stickManOne.setIcon(stickmanRunningEast);
						xMove = 4.5;
					}	
			//ALT FIRE KEY
			if(code==KeyEvent.VK_SPACE){
				if(stickManOne.getIcon()==explosionGif){
					restart();
				}
				if(robot1.getIcon()==explosionGif){
					robot1.setLocation(0,0);
					robot1.setVisible(false);
				}
				if(robot2.getIcon()==explosionGif){
					robot2.setLocation(0,0);
					robot2.setVisible(false);
				}
				if(robot3.getIcon()==explosionGif){
					robot3.setLocation(0,0);
					robot3.setVisible(false);
				}
				
				if (bullet.isVisible() == false){
					 	int x=stickManOne.getX();
					 	int y=stickManOne.getY();
					 	if (xMove > 0 && yMove == 0){
					 		bullet.setIcon(bulletEastWest);
					 		bullet.setLocation(x+12,y+12);
					 		bullet.setVisible(true);
					 		bulletvect = new Point(12,0);
					 	}
					 	else if (xMove < 0 && yMove == 0){
					 		bullet.setIcon(bulletEastWest);
					 		bullet.setLocation(x+12,y+12);
					 		bullet.setVisible(true);
					 		bulletvect = new Point(-12,0);
					 	}
				 		else if(xMove ==0 && yMove < 0){
					 		bullet.setIcon(bulletNorthSouth);
					 		bullet.setLocation(x+12,y+12);
					 		bullet.setVisible(true);
					 		bulletvect = new Point(0,-12);
				 		}
				 		else if(xMove ==0 && yMove > 0){
					 		bullet.setIcon(bulletNorthSouth);
					 		bullet.setLocation(x+12,y+12);
					 		bullet.setVisible(true);
					 		bulletvect = new Point(0,12);
				 		}
				 		else{
				 			bullet.setIcon(bulletEastWest);
					 		bullet.setLocation(x+12,y+12);
					 		bullet.setVisible(true);
					 		bulletvect = new Point(12,0);
				 			
				 		}
					 	
				}
				}
			}
	
				
			

			
		

		@Override
		public void keyReleased(KeyEvent arg0) {
			int keycode = arg0.getKeyCode();
			switch (keycode) {
			case (KeyEvent.VK_UP):
				stickManOne.setIcon(stickmanLookingEast);
				yMove = 0;
			case (KeyEvent.VK_DOWN):
				stickManOne.setIcon(stickmanLookingEast);
				yMove = 0;
			case (KeyEvent.VK_RIGHT):
				stickManOne.setIcon(stickmanLookingEast);
				xMove = 0;
			case (KeyEvent.VK_LEFT):
				//stickManOne.setIcon(stickmanLookingWest);
				xMove = 0;
				
			}
		
		}
		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	}	
