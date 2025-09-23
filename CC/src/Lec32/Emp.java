package Lec32;

public class Emp extends Person {
	private int empId;
	private long salary;
	private String deg;

	public Emp() {

	}

	public Emp(int empId,String name,int age,String address, long salary, String deg) {
		super(name,address,age);
		this.empId = empId;
		this.salary = salary;
		this.deg = deg;
	}

	public int getEmpId() {
		return empId;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getDeg() {
		return deg;
	}

	public void setDeg(String deg) {
		this.deg = deg;
	}
	
	public void display() {
		//Display????
		super.display();
		System.out.println(empId+" "+salary+" "+deg);
	}
	public static void main(String[] args) {
		Emp empObj = new Emp(1,"Raj",24,"Mathura",70384,"tester");
		empObj.display();

	}
}
