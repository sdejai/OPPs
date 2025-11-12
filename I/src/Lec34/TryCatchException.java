package Lec34;

public class TryCatchException {

	public static void main(String[] args) {
		int num1=10;
		int num2=0;
//		try {
//			int res=num1/num2;
//		}
////		catch (RuntimeException r) { // we can't do
////			System.out.println(r);
////		}
//		catch (ArithmeticException a) {
//			System.out.println(a);
//		}catch (NullPointerException n) {
//			System.out.println(n);
//		}catch (Exception e) {
//			System.out.println(e);
//		}
		String str= null;
		try {
			int res= str.length();
			System.out.println(res);
		}catch (RuntimeException r) {
			System.out.println(r);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Result");
		System.out.println("Hello Class!");
	}

}
