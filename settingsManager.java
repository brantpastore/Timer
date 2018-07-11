package Timer;

/**
 * 
 * @author brant
 *
 *	The settingsManager class is going to read from, write to our settings.log file.
 *
 *	Have a setting for Text or Images for the buttons.
 *	Have a radio button menu/list to pick what audio to play
 */

public class settingsManager {
		
	public enum ClockTimes { 
		POMODOROTIME(1), SHORTBREAK(5), LONGBREAK(10); 
		private int value; 
		
		private ClockTimes(int value) { 
			this.value = value; 
		} 
	};
	
	
	ClockTimes[] clockTimes = ClockTimes.values();
	
	private String Sound;
	private int volumePercentage;
	private int pomodoroTime;
	private int shortBreak;
	private int longBreak;
	
	public settingsManager()
	{
		this.pomodoroTime = 15;
		this.shortBreak = 5;
		this.longBreak = 15;
	}
	
	public String getSound()
	{
		return this.Sound;
	}
	public void setSound(String nSound)
	{
		this.Sound = nSound;
	}
	
	public int getVolumePercentage()
	{
		return this.volumePercentage;
	}
	
	public void setVolumePercentage(int nVolume)
	{
		this.volumePercentage = nVolume;
	}
	
	public int getTime(int ID)
	{
		switch(this.clockTimes[ID]) {
		case POMODOROTIME:
			return this.pomodoroTime;
		case SHORTBREAK:
			return this.shortBreak;
		case LONGBREAK:
			return this.longBreak;
		default:
				return 1;
		}
	}
	
	public void setTime(int ID, int time)
	{
		switch(this.clockTimes[ID]) {
		case POMODOROTIME:
			this.pomodoroTime = time;
			break;
			
		case SHORTBREAK:
			this.shortBreak = time;
			break;
			
		case LONGBREAK:
			this.longBreak = time;
			break;
			
			default:
		}
	}
	//Read from settings.log
	
	//Save to settings.log
}
