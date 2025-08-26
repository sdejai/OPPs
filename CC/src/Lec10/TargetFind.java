package Lec10;

public class TargetFind {

	public static void main(String[] args) {
		int arr[]= {2,4,61,66,12};
		int target=2;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				System.out.println("Target found ");
				return;
			}
		}
		System.out.println("target not found");
	}

}
