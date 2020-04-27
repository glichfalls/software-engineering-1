package juventus.portner.java.basics.exercise4;

import juventus.portner.java.basics.exercise1.BCDate;

public class BCDateGB extends BCDate {

	public BCDateGB(String year, String month, String day)
	{
		super(year, month, day);
	}
	
	public String getDate()
	{
		return this.year + "/" + this.month + "/" + this.day;
	}
	
}
