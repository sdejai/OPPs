package Lec39;

public class TaskMult {

	public static void main(String[] args) {
		MulFunctionalInterface ref = (num1, num2) -> num1 * num2;
//		int resullt =ref.mul(23, 2);
		System.out.println(ref.mul(23, 2));
//		System.out.println(resullt);
	}

}
