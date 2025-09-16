package Lec26;

public class StudentDetails {
	//field || instance variable
	//properties of object
	//state of object
	int rollNumber;
	String name;
	String address;
	
	//Method
	//behaviour of object
	public void tellMeAbout() {
		System.out.println("My name is "+name +" Roll num "+rollNumber+" and address is "+address+" ");
	}
	public static void main(String[] args) {
		StudentDetails stdObj=new StudentDetails();
		stdObj.rollNumber=1;
		stdObj.name="Rakesh";
		stdObj.address="Mathura";
		stdObj.tellMeAbout();
	}
}
