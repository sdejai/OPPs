package Lec5;

public class FindIndex {

	public static void main(String[] args) {
		int arr[]= {12,43,6,34,98};
		int target=6;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				System.out.println(i);
				return;
			}
		}
		System.out.println("-1");
	}

}
