package Lec7;

public class TargetFind {

	public static void main(String[] args) {
		int arr[]= {12,4,68,96,2};
		int target=4;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				System.out.println("Target found ");
				return;
			}
		}
		System.out.println("target not found");
	}

}
