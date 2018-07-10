package Timer;

/**
 * 
 * @author brant
 *
 * The clock class managers our timer(s)
 */

public class clock {
	private int timeLimit;
	public int currentTime;
	
	public clock(int time)
	{
		this.timeLimit = time;
	}
	
	/**
	 * getTime()
	 * returns the amount of time left on our current timer.
	 * @return
	 */
	public int getTime()
	{
		return this.timeLimit;
	}
	
	public void setTimer(int time)
	{
		this.timeLimit = time;
	}
	
	public void addTime(int time)
	{
		this.timeLimit += time;
	}
	
	public void subtractTime(int time)
	{
		this.timeLimit -= time;
	}
}
