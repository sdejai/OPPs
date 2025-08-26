package Lec8;

public class ArraySum {

	public static void main(String[] args) {
		int arr[]= {12,5,3,23,9};
//	arr[]=	{9,23,3,5,12}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
