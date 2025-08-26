package Lec10;

public class FindMin {

	public static void main(String[] args) {
		int arr[]= {-1,24,5,-4,98};
		int minElement=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(minElement>arr[i]) {
				minElement=arr[i];
			}
		}
		System.out.println(minElement);
	}

}
