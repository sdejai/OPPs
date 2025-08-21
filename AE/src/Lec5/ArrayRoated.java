package Lec5;

public class ArrayRoated {

	public static void main(String[] args) {
		int arr[]= {5,3,2,78,1};
		int k=3;
		for(int r=0;r<k;r++) {
			int lastIndex=arr[arr.length-1];
			for(int i=arr.length-1;i>0;i--) {
				arr[i]=arr[i-1];
			}
			arr[0]=lastIndex;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
