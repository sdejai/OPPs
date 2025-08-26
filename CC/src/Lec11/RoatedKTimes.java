package Lec11;

public class RoatedKTimes {

	public static void main(String[] args) {
		int arr[] = { 112, 55, 7, 90, 12, 45 };
		int k = 3;
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
