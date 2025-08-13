package Lec7;

public class ArraySum {

	public static void main(String[] args) {
		int arr[]= {12,2,1,3,8};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
