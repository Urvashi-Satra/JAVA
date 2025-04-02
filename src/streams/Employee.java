package streams;

public class Employee {
	private int id;
	private String Name;
	private String dept;
	private int Salary;
	public Employee(int id, String name, String dept, int salary) {
		super();
		this.id = id;
		Name = name;
		this.dept = dept;
		Salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
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
		return "Employee [id=" + id + ", Name=" + Name + ", dept=" + dept + ", Salary=" + Salary + "]";
	}
	

}
