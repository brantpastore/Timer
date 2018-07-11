package Timer;
import Timer.windowManager;

import java.awt.event.KeyEvent;
import java.time.Duration;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import Timer.myClock;
//import Timer.settingsManager;

public class Timer {
	
	public static void main(String[] args) {
		windowManager winMgr = new windowManager();
		winMgr.setOpaque(true);
		windowManager.frame.setContentPane(winMgr);
		Duration d = Duration.ofHours(1);
		myClock clockMgr = new myClock(d);
		

		ImageIcon img = null;
		winMgr.start = winMgr.createButton(winMgr.start, img, "Start", 1, AbstractButton.CENTER, AbstractButton.LEADING, "Starts the timer.");	
		winMgr.start = winMgr.createButton(winMgr.start, img, "Stop", 2, AbstractButton.CENTER, AbstractButton.LEADING, "Stops the timer.");	
		winMgr.start = winMgr.createButton(winMgr.start, img, "Reset", 3, AbstractButton.CENTER, AbstractButton.LEADING, "Resets the timer.");	
		winMgr.start = winMgr.createButton(winMgr.start, img, "Short Break", 4, AbstractButton.CENTER, AbstractButton.LEADING, "Starts a short (5 minute) break.");	
		winMgr.start = winMgr.createButton(winMgr.start, img, "Long Break", 5, AbstractButton.CENTER, AbstractButton.LEADING, "Start a long (15 minute) break.");	
		
		System.out.println(clockMgr.getTimer());		
		System.out.println(clockMgr.getCurrentTime());		
	}
}
