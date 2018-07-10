package Timer;
import javax.swing.JFrame;

/** 
 * 
 * @author brant
 * 
 * The windowManager class creates, adjusts, and handles all visual aspects of the timer project.
 */

public class windowManager {
	private static JFrame frame;
	public windowManager()
	{
		frame = new JFrame("Timer");
		frame.setVisible(true);
		
		frame.setSize(600, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public void CreateButtons()
	{
		//start, stop, reset
		//short break, long break
		// Short break is automatically started after an initial 15 minute timer. 
		// long break is automatically started after 3 short breaks and after the fourth iteration of the timer. 
	}
	
	public void CloseWindow()
	{
		// TODO: Save Settings, Delete state of clock/timer.
	}
}
