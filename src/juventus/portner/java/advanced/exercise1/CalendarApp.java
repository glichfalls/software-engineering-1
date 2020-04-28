package juventus.portner.java.advanced.exercise1;

public class CalendarApp {

	public static void main(String args[])
	{
		
		BCDateCH ch = new BCDateCH("2020", "04", "28");
		System.out.println(ch.getDate());
		
		BCDateGB gb = new BCDateGB("2020", "04", "28");
		System.out.println(gb.getDate());
	
	}
	
}
