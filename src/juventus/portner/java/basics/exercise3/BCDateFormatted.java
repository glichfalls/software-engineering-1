package juventus.portner.java.basics.exercise3;

import juventus.portner.java.basics.exercise1.BCDate;

public class BCDateFormatted extends BCDate {

	public BCDateFormatted(String year, String month, String day) 
	{
		super(year, month, day);
	}
	
	public String getFormattedDateCH()
	{
		return this.day + "." + this.month + "." + this.year; 
	}
	
	public String getFormattedDateGB()
	{
		return this.year + "/" + this.month + "/" + this.day;
	}
	
	
}
