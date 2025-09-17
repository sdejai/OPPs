package Lec22;

public class StudentClassObject {
	// state||properties
	// field || intance variable
	int rollNum;
	String name;
	float hight;
	float weight;
	String address;
	
	// behaviour
	// method
	public void tellMeAbout() {
		System.out.println("My name is "+name +" roll num "+rollNum+ " address "+address);
	}
	

	public static void main(String[] args) {
		StudentClassObject stdObj = new StudentClassObject();
		stdObj.rollNum=1;
		stdObj.name="Dev";
		stdObj.hight=5.11f;
		stdObj.weight=72;
		stdObj.address="Mathura";
//		System.out.println(stdObj.rollNum);
//		System.out.println(stdObj.name);
		stdObj.tellMeAbout();
		
		StudentClassObject stdObj2 = new StudentClassObject();
		stdObj2.rollNum=2;
		stdObj2.name="Raj";
		stdObj2.hight=6;
		stdObj2.weight=78;
		stdObj2.address="Agra";
		stdObj2.tellMeAbout();
		
	}
}
