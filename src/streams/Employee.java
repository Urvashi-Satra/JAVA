package streams;

public class Employee {

	private String Name;
	private int Salary;
	public Employee(String name, int salary) {
		// TODO Auto-generated constructor stub
		this.Name = name; 
		this.Salary = salary;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", Salary=" + Salary + "]";
	}

}
