package Lec35;

public class TryCatchExceptions {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
		int arr[]= {12,3,4};
		try {
			System.out.println(num1 / num2);
		}// catch (ArithmeticException ar) {
//			System.out.println(ar);
//		}catch (ArrayIndexOutOfBoundsException a) {
//			System.out.println(a);
//		}
		catch (ArithmeticException | ArrayIndexOutOfBoundsException a) {
			System.out.println(a);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Hello Class");
	}

}
