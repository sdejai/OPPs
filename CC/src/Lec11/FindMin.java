package Lec11;

import java.util.Scanner;

public class FindMin {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		int minElement=arr[0];
		for (int i = 0; i <arr.length; i++) {
			if(arr[i]<minElement) {
				minElement=arr[i];
			}
		}
		System.out.println(minElement);
	}

}
