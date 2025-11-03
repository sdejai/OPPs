package Lec36;

public class ThrowsException {
	
	public static void divide() throws ArithmeticException {
		System.out.println(12/0);
	}
	
	public static void calculator() throws ArithmeticException {
		divide();
	}
	public static void main(String[] args) {
		try {
			calculator();
		} catch (ArithmeticException a) {
			System.out.println(a);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Casio Calculator");
		System.out.println("Casio adv Calculator");
	}
}
