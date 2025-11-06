package Lec33;

public class SumTwoNum {

	public static void main(String[] args) {
		
		FunctInterface ref=(num1,num2)->num1+num2;
		FunctInterface ref1=(num1,num2)->num1*num2;
		System.out.println(ref.sum(23, 12));
		System.out.println(ref1.sum(2, 12));
	}

}
