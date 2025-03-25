package lambdas;

public class Persons {

	private String firstname;
	private String lastname;
	private int age;
	
	
	public Persons(String firstname, String lastname, int age) {
		this.firstname=firstname;
		this.lastname = lastname;
		this.age = age;
		
	}
	
	public String getfirstname() {
		return firstname;
	}
	
	public void setfirstname(String inputFirstname) {
		this.firstname=inputFirstname;
	}
	
	public String getlastname() {
		return lastname;
	}
	public void setlastname(String inputLastname) {
		this.lastname=inputLastname;
	}
	
	public int getage() {
		return age;
	}
	
	public void setage(int inputage) {
		this.age=inputage;
	}

	@Override
	public String toString() {
		return "Persons [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + "]";
	}
	
	
}
