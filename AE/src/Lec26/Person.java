package Lec26;

public class Person {
	private String name;
	private String address;
	private  int age;
	private String gender;
	private long mobileNumber;
	private String mail;
	//Default constructor 
	public Person() {
		 
	}
	public Person(String name, String address, int age, String gender, long mobileNumber, String mail) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
		this.mail = mail;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
//	public void display() {
//		System.out.print(name+" "+address+" "+gender+" "+age+" "+mobileNumber+" "+mail+" ");
//	}
}
