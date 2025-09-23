package Lec26;

public class Emp extends Person {
	private long salary;
	private int empId;
	private String degnt;
	public Emp() {
		
	}
	public Emp(long salary, int empId, String degnt,String name,String address,int age,String gender,long mobileNumber,String mail) {
		super(name,address,age,gender,mobileNumber,mail);
		this.salary = salary;
		this.empId = empId;
		this.degnt = degnt;
	}
	public void display() {
		System.out.println("Emplyee Details- "
				+getName()+" "
				+getAge()+" "
				+getGender()+" "
				+getAddress()+" "
				+getMobileNumber()+" "
				+getMail()+" "+empId+" "+salary+" "+degnt+" ");
		
//		super.display();
//		System.out.print(empId+ " "+salary+" "+degnt+" ");
//		System.out.println();
	}
	
}
