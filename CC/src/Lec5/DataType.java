package Lec5;

import java.util.Scanner;

public class DataType {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		byte b=sc.nextByte();
//		short s=sc.nextShort();
//		int i=sc.nextInt();
//		long l=sc.nextLong();
//		System.out.println("byte number is "+b);
//		System.out.println("short number is "+s);
//		System.out.println("int number is "+i);
//		System.out.println("long number is "+l);
		float f=sc.nextFloat();
		double d=sc.nextDouble();
		char c=sc.next().charAt(0);
		boolean t=sc.nextBoolean();
		System.out.println("float number is "+f);
		System.out.println("double number is "+d);
		System.out.println("char is "+c);
		System.out.println("boolean is "+t);
		byte b=10;
		long l=b;
		System.out.println(l);
		long l1=1000;
		int i=(int)l1;
		System.out.println(i);
	}

}
