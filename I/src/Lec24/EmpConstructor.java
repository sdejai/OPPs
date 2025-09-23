package Lec24;

public class EmpConstructor {

	int empId;
	String empName;

	// Default Constructor
	public EmpConstructor() {
	}

	// parameterized Constructor
	public EmpConstructor(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	// parameterized Constructor
	public EmpConstructor(String empName) {
		this.empName = empName;
	}

	public void display() {
		System.out.println("Emp details :- " + empId + " , " + empName);
	}
}
