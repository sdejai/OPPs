package Lec7;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i+ " is even number ");
			}
			else {
				System.out.println(i+" is odd number ");
			}
		}
	}

}
