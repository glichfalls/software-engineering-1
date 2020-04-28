package juventus.portner.java.advanced.exercise1;

public class BCDateGB extends AbstractDate {

	public BCDateGB(String year, String month, String day) {
		super(year, month, day);
	}

	public String getDate() {
		return this.year + '-' + this.month + '-' + this.day;
	}
	
}
