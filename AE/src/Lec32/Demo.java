package Lec32;

public interface Demo {

	public static final int name = 0;

	public abstract void dsa();
	void oops();

	public static void methodName() {
		System.out.println("Demo Interface");
	}
	
	default void methodDefault() {
		System.out.println("Deafult method");
	}
}
