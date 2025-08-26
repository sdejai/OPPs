package Lec8;

import java.util.Scanner;

public class ArraysInput {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int len=scanner.nextInt();
		int arr1[]=new int[len];
		for(int i=0;i<len;i++) {
			arr1[i]=scanner.nextInt();
		}
//		int arr[]= {1,24,76,4,3};
//		System.out.println(arr.length);
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
//		int num;
//		System.out.println(num);
	}

}
