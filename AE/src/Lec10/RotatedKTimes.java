package Lec10;

public class RotatedKTimes {

	public static void main(String[] args) {
		int arr[] = { 12, 3, 476, 98, 122 };
		int k = 2;
		for (int r = 0; r < k; r++) {
			int lastIndexValue = arr[arr.length - 1];
			for (int i = arr.length - 1; i > 0; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = lastIndexValue;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
