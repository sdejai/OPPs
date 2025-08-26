package Lec11;

public class PrivotIndex {

	public static void main(String[] args) {
		int arr[]= {1,7,2,6,5,6};
		int totalSum=0;
		int leftSum=0;
		for(int i=0;i<arr.length;i++) {
			totalSum=totalSum+arr[i];
		}
		for(int i=0;i<arr.length;i++) {
			if(leftSum==(totalSum-(leftSum+arr[i]))){
				System.out.println(i);
				return;
			}
			leftSum=leftSum+arr[i];
		}
		System.out.println("-1");
	}
}
