package juventus.portner.java.basics.exercise1;

import juventus.portner.java.basics.exercise3.BCDateFormatted;
import juventus.portner.java.basics.exercise4.BCDateCH;
import juventus.portner.java.basics.exercise4.BCDateGB;

public class CalendarApp {
	
	public static void main(String[] args) 
	{
		
		BCCalendar calendar = new BCCalendar();
		calendar.setDate("31", "03", "2020");
		
		// exercise 3
		BCDateFormatted formattedDate = new BCDateFormatted("2020", "04", "04");
		
		System.out.println(formattedDate.getFormattedDateCH());
		System.out.println(formattedDate.getFormattedDateGB());
		
		
		// exercise 4
		BCDateCH dateCH = new BCDateCH("2020", "04", "04");
		System.out.println(dateCH.getDate());
		
		BCDateGB dateGB = new BCDateGB("2020", "04", "04");
		System.out.println(dateGB.getDate());
		
	}

}
