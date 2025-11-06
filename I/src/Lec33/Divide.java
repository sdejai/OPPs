package Lec33;

public class Divide {

	public static void main(String[] args) {
		DivideFuntInterface ref = (num1,num2)->num1/num2;
		System.out.println(ref.divide(22, 11));
	}

}
