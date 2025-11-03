package Lec32;

public interface Demo {
	//only public static & final we can
//	private String name;
	public static final int empId = 123;
	
	public abstract void dsa();
	//it's also an abstract method
	void oops();
	
	public static void interfaceDemo() {
		System.out.println("Demo Interface Day1 of blueprint");
	}
	
	default void defaultMethod() {
		System.out.println("Demo Defalt method");
	}
}