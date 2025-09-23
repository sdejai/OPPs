package Lec30;

public class ChildClass extends ParentClass{
	public ChildClass() {
		System.out.println("Hey I am child class construtor");
	}
	
	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
	}
}
