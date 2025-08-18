package Lec8;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[]= {12,54,8,2};
		int st=0;
		int end=arr.length-1;
		while(st<end) {
			int tempValue=arr[end];
			arr[end]=arr[st];
			arr[st]=tempValue;
			st++;
			end--;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
//		System.out.println();
//		System.out.println(2%4);
	}

}
