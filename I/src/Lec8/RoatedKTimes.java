package Lec8;

public class RoatedKTimes {

	public static void main(String[] args) {
		int arr[] = { 12, 5, 7, 9 };
		int k = 2;
		for (int r = 0; r < k; r++) {
			int lastValue = arr[arr.length - 1];
			for (int i = arr.length - 1; i > 0; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = lastValue;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
