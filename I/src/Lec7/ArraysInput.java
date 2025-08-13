package Lec7;

import java.util.Scanner;

public class ArraysInput {
	public static void main(String[] args) {
		int arrInput[]= {12,4,3,7,8,87654,97};
		System.out.println(arrInput.length);
		Scanner sc =new Scanner(System.in);
		int len=sc.nextInt();
		int arr[]= new int[len];
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
