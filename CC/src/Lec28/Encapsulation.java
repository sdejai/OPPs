package Lec28;

public class Encapsulation {
	//using private (access modifiers) 
	private int rollNum;
	private String name;
	private String address;

	//Parameterize Constructor
	public Encapsulation(int rollNum, String name, String address) {
		this.rollNum = rollNum;
		this.name = name;
		this.address = address;
	}
	//Default Constructor
	public Encapsulation() {
	}

	public void setRollNumber(int rollNum) {
		this.rollNum = rollNum;
	}

	public void setName(String name) {
		this.name = name;
	}

}
