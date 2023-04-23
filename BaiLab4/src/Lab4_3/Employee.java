package Lab4_3;

public class Employee extends PerSon {
	private String employerName , dateHired;


	public Employee(String name, int age, char gender, String employerName, String dateHired) {
		super(name, age, gender);
		this.employerName = employerName;
		this.dateHired = dateHired;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public String getDateHired() {
		return dateHired;
	}

	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}
	
	
	public String toString() {
		return super.toString()+ " || " +"EmployerName: " + employerName + " || " + "DateHired: " + dateHired;
	}
	
	
}
