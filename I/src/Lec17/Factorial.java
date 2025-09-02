package Lec17;

public class Factorial {

	public void fact(int number) {
		int multi = 1;
		for (int i = number; i >= 1; i--) {
			multi = multi * i;
		}
		System.out.println(multi);
	}
	public static void fact1(int number) {
		int multi = 1;
		for (int i = number; i >= 1; i--) {
			multi = multi * i;
		}
		System.out.println(multi);
	}

	public static int factorial(int num) {
		if(num==0|| num==1) {
			return 1;
		}
		return num*factorial(num-1);
	}
	public static void main(String[] args) {
		Factorial obj = new Factorial();
		int num = 5;
		obj.fact(num);
		fact1(num);//static Method
		System.out.println(factorial(num));
	}

}
