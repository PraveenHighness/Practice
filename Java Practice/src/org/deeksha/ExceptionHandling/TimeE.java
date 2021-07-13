package src.org.deeksha.ExceptionHandling;

public class TimeE 
{
	private int day;
	private int month;
	private int year;
	
	private int hour;
	private int minut;
	private int seconds;
	
	public TimeE(int day,int month,int year, int hour,int minut,int seconds)
	{
		
		if( (day >=1 && day <= 31) && (month >=1 && month <= 12) && (year >= 0 && year <= 5000 ) && 
		 (hour >=0 && hour<=24) && (minut >= 0 && minut <= 60) && (seconds >= 0 && seconds <= 60) )
		 {
			this.day = day;
			this.month = month;
			this.year = year;
			
			this.hour= hour;
			this.minut = minut;
			this.seconds = seconds;
			
		 }
		else
		{
			throw new Customeside_Exception();
		}
	}
	@Override
	public String toString()
	{
		return "Date & Time :" +this.day+" : "+this.month+" : "+this.year+" : "+this.hour+" : "+this.minut+" : "+this.seconds+"";
	}
	public void changeTime(int day,int month,int year, int hour,int minut,int seconds )
	{
		if( (day>=1 && day<=31) && (month>=1 && month<=12) && (year>=0 && year<=5000 ) && 
				 (hour>=0 && hour<=24) && (minut>=0 && minut<=60) && (seconds >= 0 && seconds <= 60) )
				 {
					this.day = day;
					this.month = month;
					this.year = year;
					
					this.hour= hour;
					this.minut = minut;
					this.seconds = seconds;
					
				 }
		else
		{
			throw new Customeside_Exception();

		}
	}
}
