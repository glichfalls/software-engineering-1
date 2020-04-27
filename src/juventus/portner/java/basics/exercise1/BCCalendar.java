package juventus.portner.java.basics.exercise1;

public class BCCalendar {

	private BCDate[] dates = new BCDate[365];
	private int count = 0;
	
	public void setDate(String day, String month, String year)
	{
		this.dates[this.count] = new BCDate(day, month, year);
		this.count++;
	}
	
	public BCDate[] getDates()
	{
		return this.dates;
	}

}
