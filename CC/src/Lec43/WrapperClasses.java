package Lec43;

public class WrapperClasses {

	public static void main(String[] args) {

//		AutoBoxing Or Auto Wrapping
		int i = 10;
		Integer wI = i;

		Integer wI1 = Integer.valueOf(i);

		char cc = 'a';
		Character wC = cc;
		System.out.println(cc);
		System.out.println(wC);

		byte b = 1;
		Byte wB = b;
		System.out.println(b);
		System.out.println(wB);

//		Unboxing 
		Integer num1 = 10;
		int val = num1;
		System.out.println(num1);
		System.out.println(val);

		Integer wNum = 102;
		int num = wNum.intValue();
		System.out.println(wNum);
		System.out.println(num);

		Double dW = 10223.0d;
		double d = dW.doubleValue();
		System.out.println(dW);
		System.out.println(d);
	}

}
