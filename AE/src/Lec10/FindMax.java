package Lec10;

public class FindMax {

	public static void main(String[] args) {
		int arr[]= {12,43,6,89876,34,1};
		int maxElement=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxElement) {
				maxElement=arr[i];
			}
		}
		System.out.println(maxElement);
	}

}
