package Lec21;

public class Student {
	int rollNum; // state || properties 
	String name; // fields || instance variable
	String address;
	
	//methods
	//behaviours
	public void display() {
		System.out.println(rollNum);
		System.out.println(name);
		System.out.println(address);
	}
	public void read(String str) { 	
		System.out.println("Student is reading "+ str);
	}
	
	public static void main(String[] args) {
		Student stdObj = new Student();
		stdObj.rollNum=1;
		stdObj.name="Rahukl";
		stdObj.address="mathura";
		stdObj.display();
		Student stdObj1 = new Student();
		stdObj1.rollNum=2;
		stdObj1.name="Abhi";
		stdObj1.address="Agra";
		stdObj1.display();
		Student stdObj3 = new Student();
		stdObj3.display();
		stdObj3.read("Kamlesh is reading!");
	}
	
}
