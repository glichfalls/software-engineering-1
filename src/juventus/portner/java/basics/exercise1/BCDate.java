package juventus.portner.java.basics.exercise1;

public class BCDate {

	protected String day;
	protected String month;
	protected String year;
	
	public BCDate(String year, String month, String day)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public String getDay()
	{
		return this.day;
	}
	
	public void setDay(String day)
	{
		this.day = day;
	}
	
	public String getMonth()
	{
		return this.month;
	}
	
	public void setMonth(String month)
	{
		this.month = month;
	}
	
	public String getYear()
	{
		return this.year;
	}
	
	public void setYear(String year) 
	{
		this.year = year;
	}
	
	public String getFullDate()
	{
		return this.day + "." + this.month + "." + this.year;
	}
	
	public String getDate()
	{
		return (String) this.day + this.month + this.year;
	}
	
}
