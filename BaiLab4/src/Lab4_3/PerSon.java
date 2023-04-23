package Lab4_3;

public class PerSon {
	private String name;
	private int age;
	private char gender;
	
	public PerSon(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String toString() {
		return "Name: " + name + "||" + "Age: " + age + "||" + "Gender: " +gender; 
	}
	
	
}
