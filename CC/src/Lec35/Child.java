package Lec35;

public class Child extends Parents{
	
	@Override
	public void display() {
		System.out.println("Child class method");
	}
	public static void main(String[] args) {
//		Child objChild = new Child();
//		objChild.display();
//		Parents objParents = new Parents();
//		objParents.display();
		
		Parents obj = new Child();
		obj.display();
	}
}
