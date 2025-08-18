package Lec11;

public class FindMax {

	public static void main(String[] args) {
		int arr[] = { 5, 8, 2, 11, 16, 9,100,74,190 };
//	System.out.println(arr.length);
		int maxElement=Integer.MIN_VALUE;
		for (int i = 0; i <arr.length; i++) {
			if(arr[i]>maxElement) {
				maxElement=arr[i];
			}
		}
		System.out.println(maxElement);
	}

}
