package Lec25;

public class Encapsulation {
	private String name;
	private int age;
	private String address;
	private int totalMember;
	
	public Encapsulation() {
		
	}
	public Encapsulation(String name,int age,String address,int totalMember) {
		this.name=name;
		this.age=age;
		this.address=address;
		this.totalMember=totalMember;
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
	public int getTotalMember() {
		return totalMember;
	}
	public void setTotalMember(int totalMember) {
		this.totalMember = totalMember;
	}
	
	
	public void display() {
		System.out.println(name);
	}
	
	
}
