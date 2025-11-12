package Lec34;

public class ThrowsExceptions {

	public static void divide(int num1, int num2) throws Exception{
		System.out.println(num1 / num2);
	}

	public static void calculator(int val1, int val2) throws Exception{
//		try {
//			divide(val1, val2);
//		} catch (Exception e) {
//			System.out.println(e);
//		}
		divide(val1, val2);
	}

	public static void main(String[] args) throws Exception{
		try {
			calculator(12, 0);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Section I");
	}

}
