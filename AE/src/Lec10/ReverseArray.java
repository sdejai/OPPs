package Lec10;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[] = { 12, 5, 3, 23, 9 };
		int st = 0;
		int end = arr.length - 1;
		while(st<end) {
			int temp=arr[st];
			arr[st]=arr[end];
			arr[end]=temp;
			st++;
			end--;
		}
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i]+" " );
		 }
		 System.out.println();
		 System.out.println(arr[0]);
		// for(int i=arr.length-1;i>=0;i--) {//reverse print
//			System.out.print(arr[i]+" " );
//		}
//		System.out.println();
//		System.out.println(arr[0]);
	}

}
