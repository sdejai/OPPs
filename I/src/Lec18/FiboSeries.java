package Lec18;

import java.util.Scanner;

public class FiboSeries {

	public static void fibo(int nOrder) {
		int num1 = 0;
		int num2 = 1;
		for (int i = 0; i <= nOrder; i++) {
			System.out.print(num1 + " ");
			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nOrder = sc.nextInt();
		fibo(nOrder);
	}

}
