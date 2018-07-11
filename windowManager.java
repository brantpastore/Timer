package Timer;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/** 
 * 
 * @author brant
 * Docs used: 
 * https://docs.oracle.com/javase/7/docs/api/javax/swing/JFrame.html
 * https://docs.oracle.com/javase/tutorial/uiswing/components/button.html
 * 
 * The windowManager class creates, adjusts, and handles all visual aspects of the timer project.
 */

public class windowManager extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	public static JFrame frame;
	protected JButton start, stop, reset, shortBreak, longBreak;
	
	public static enum Buttons {
		start,
		stop, // Works the same as a "pause" button
		reset,
		shortBreak,
		longBreak
	}
	
	public windowManager()
	{
		frame = new JFrame("Timer");		
		frame.setSize(600, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		frame.pack();
		frame.setVisible(true);
	}
	
	protected JButton createButton(JButton btn, ImageIcon img, String bName, int buttonID, int vPos, int hPos, String tip)
	{
		if (img != null) {
			btn = new JButton(bName, img);
		} else {
			btn = new JButton(bName);
		}
		btn.setVerticalTextPosition(vPos);
		btn.setHorizontalTextPosition(hPos);
		btn.setMnemonic(buttonID);
		btn.setToolTipText(tip);
		add(btn);
		return btn;
	}
	
	public void actionPerformed(ActionEvent e) {
		// Based on buttonID, rotate through what function to call
	}
	
	private void closeWindow()
	{
		// TODO: Save Settings, Delete state of clock/timer.
	}
}
