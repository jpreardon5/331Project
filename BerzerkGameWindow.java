import javax.swing.JFrame;

/**
 * @author JPR
 *
 */
public class BerzerkGameWindow extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The window contains the Berzerk game Screen.
	 */
	public BerzerkGameWindow(){
		setTitle("Berzerk");
		Screen screen = new Screen();
		add(screen);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pack();
		setVisible(true);
		
	}
	/**
	 * Create the Berzerk window.
	 * @param args Ignored.
	 */

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		BerzerkGameWindow window = new BerzerkGameWindow();
	}

}

