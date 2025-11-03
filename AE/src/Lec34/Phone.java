package Lec34;

public class Phone {

	String name;

	public Phone() {

	}

	public Phone(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Phone Brand Name is "+name;
	}
	public static void main(String[] args) {
		Phone obj = new Phone("Nokia");
		System.out.println(obj);
	}

}
