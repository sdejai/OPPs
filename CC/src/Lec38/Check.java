package Lec38;

public class Check implements Demo{

	public void dsa() {
		System.out.println("DSA teacher");
	}

	public void oops() {
		System.out.println("OOPs teacher");
	}
	

	public static void main(String[] args) {
		Check obj =new Check();
//		Demo obj1 = new Demo(); not allowed
//		obj.name="hi";
		obj.dsa();
		obj.oops();
		Demo.display1();
		obj.display2();
	}
}
