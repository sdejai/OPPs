package Lec8;

import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i=i+1) {
			System.out.print(i+" ");
		}
	}
}
