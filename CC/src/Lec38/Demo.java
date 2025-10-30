package Lec38;

public interface Demo {
	public static final String name="Hi";
	
	public abstract void dsa() ;
	void oops() ;
	
	public static  void display1() {
		System.out.println("Display1");
	}
	
	default void display2() {
		System.out.println("Display2");
	}
	
}
