package Timer;
import Timer.windowManager;

import java.time.Duration;

import Timer.myClock;
//import Timer.settingsManager;

public class Timer {
	public static void main(String[] args) {
		windowManager winMgr = new windowManager();
		Duration d = Duration.ofHours(1);
		myClock clockMgr = new myClock(d);
		

		System.out.println(clockMgr.getTimer());
		

		
		System.out.println(clockMgr.getCurrentTime());
	}
}
