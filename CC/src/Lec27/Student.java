package Lec27;

public class Student {
	String name;
	int rollNumber;
	String address;
	
	//Default Constructor
	public Student() {
	}
	//Parameterize Constructor
	public Student(int rollNumber,String name,String address) {
		this.rollNumber=rollNumber;
		this.name=name;
		this.address=address;
	}
	public void display() {
		System.out.println("Student Roll number is "+rollNumber);
		System.out.println("Student name is "+name);
		System.out.println("Student address number is "+address);
	}
	public static void main(String[] args) {
		Student obj1 =  new Student(23, "Rahul", "mathura");
		Student obj2 =  new Student(24, "Rakesh", "Agra");
		obj1.display();
		obj2.display();
//		Student obj1 =  new Student();
	}
}
