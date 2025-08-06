package Lec4;
import java.util.Scanner;

public class ProductOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number");
		int num2=sc.nextInt();
		int prod=num1*num2;
		System.out.println("Product of two Number is "+prod);
	}

}
