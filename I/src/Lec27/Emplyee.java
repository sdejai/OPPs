package Lec27;

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

}
