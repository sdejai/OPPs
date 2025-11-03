package Lec40;

public class TryCatch {
	public static void main(String[] args) {
//		int num1 = 12;
//		int num2 = 0;
//		System.out.println(num1/num2);
		try {
			int arr[] = { 12, 3, 4, 0 };
			for (int i = 0; i <= arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		} catch (ArithmeticException at) {
			System.out.println(at);
		}catch (ArrayIndexOutOfBoundsException e) { 
			System.out.println(e);
		}catch(Exception excHandle){
			System.out.println(excHandle);
		}
		System.out.println("Hello");
	}
}
