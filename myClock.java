package Timer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;

/**
 * 
 * @author brant
 *
 * The clock class managers our timer(s)
 */

public class myClock {
	private Clock myClock;
	private int timeLimit;
	//private int currentTime;
	
	public myClock(Duration dur)
	{
		Clock c = Clock.systemUTC();
		this.myClock = Clock.offset(c, dur);
	}
	
	public String getCurrentTime()
	{
		String timeStamp = new SimpleDateFormat("HH:mm.ss").format(Calendar.getInstance().getTime());
		return timeStamp;
	}
	
	public void startClock(Duration dur)
	{
		Clock.offset(myClock, dur);
	}
	
	/**
	 * getTime()
	 * returns the amount of time left on our current timer.
	 * @return
	 */
	public String getTimer()
	{
		return this.myClock.instant().toString();
	}
	
	public void setTimer(Duration dur)
	{
		Clock c = Clock.systemUTC();
		this.myClock = Clock.offset(c, dur);
	}
	
	public void addTime(int hours, int minutes)
	{
		this.myClock.instant().plus(Duration.ofHours(hours).plusMinutes(minutes));
	}
	
	public void subtractTime(int hours, int minutes)
	{
		this.myClock.instant().minus(Duration.ofHours(hours));
		this.myClock.instant().minus(Duration.ofMinutes(minutes));
	}
	
	
}
