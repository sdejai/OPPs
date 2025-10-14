package Lec28;

public class Emplyee extends Person {
	private long empId;
	private String deg;
	private long salary;
	private String empMail;

	public Emplyee() {

	}

	public Emplyee(long empId, String deg, long salary, String empMail, String name, int age, String address,
			long mobileNumber) {
		super(name, age, address, mobileNumber);
		this.empId = empId;
		this.deg = deg;
		this.salary = salary;
		this.empMail = empMail;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getDeg() {
		return deg;
	}

	public void setDeg(String deg) {
		this.deg = deg;
	}

	public String getEmpMail() {
		return empMail;
	}

	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}

	public void display() {
		super.display();
		//here we can use getter setter of parent class using display method
		System.out.println(empId+", "+deg+", "+salary+", "+empId+" ");
	}

}
