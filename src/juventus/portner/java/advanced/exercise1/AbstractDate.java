package juventus.portner.java.advanced.exercise1;

public abstract class AbstractDate {

	protected String day;
	protected String month;
	protected String year;
	
	public AbstractDate(String year, String month, String day)
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
	
	public String getDateFormatted()
	{
		return (String) this.day + this.month + this.year;
	}
	
	
	public abstract String getDate();
	
}
