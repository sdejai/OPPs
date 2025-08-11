package Lec10;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int arr[] = new int[len];
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(arr[4]);
	}

}
