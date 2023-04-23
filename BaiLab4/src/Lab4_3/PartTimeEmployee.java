package Lab4_3;

public class PartTimeEmployee extends Employee {
	
	private int hourPerWeek;

	public PartTimeEmployee(String name, int age, char gender, String employerName, String dateHired, int hourPerWeek) {
		super(name, age, gender, employerName, dateHired);
		this.hourPerWeek = hourPerWeek;
	}

	public int getHourPerWeek() {
		return hourPerWeek;
	}

	public void setHourPerWeek(int hourPerWeek) {
		this.hourPerWeek = hourPerWeek;
	}

	
	public String toString() {
		return  super.toString()+ "||" + "HourPerWeek: " + hourPerWeek ;
	}
	
	
}
