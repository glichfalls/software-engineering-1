package juventus.portner.java.advanced.exercise1;

public class BCDateCH extends AbstractDate {

	public BCDateCH(String year, String month, String day) {
		super(year, month, day);
	}

	public String getDate() {
		return this.day + '.' + this.month + '.' + this.year;
	}
	
}
