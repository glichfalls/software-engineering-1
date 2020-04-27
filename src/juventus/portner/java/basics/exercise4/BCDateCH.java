package juventus.portner.java.basics.exercise4;

import juventus.portner.java.basics.exercise1.BCDate;

public class BCDateCH extends BCDate {

	public BCDateCH(String year, String month, String day)
	{
		super(year, month, day);
	}
	
	public String getDate()
	{
		return this.day + "." + this.month + "." + this.year;
	}
	
}
