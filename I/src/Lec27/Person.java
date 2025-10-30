package Lec27;

public class Person {
	private String name;
	private int age;
	private String address;
	private long mobileNumber;

	public Person() {

	}

	public Person(String name, int age, String address, long mobileNumber) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.mobileNumber = mobileNumber;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

//	public void display() {
//		System.out.println(name+" "+age+" "+address+" "+mobileNumber);
//	}

}
