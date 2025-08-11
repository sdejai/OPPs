package Lec9;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int num;
//		System.out.println(num);
		int len=sc.nextInt();
		int arr[] =new int[len];
		int sum=0;
		for(int i=0;i<len;i++) {//input
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<len;i++) {//output
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<len;i++) {
			sum=sum+ arr[i];
		}
		System.out.println(sum);
	}

}
