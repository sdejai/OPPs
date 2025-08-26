package Lec15;

public class Array2DSum {

	public static void main(String[] args) {
		int arr[][] = { { 10, 12, 3 }, { 2, 8, 18 }, { 3, 4, 7 } };
		int sum=0;
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c <arr[0].length; c++) {
				sum=sum+arr[r][c];
			}
		}
		System.out.println(sum);
//		for (int r = 0; r < arr.length; r++) {
//			for (int c = 0; c <arr[0].length; c++) {
//				System.out.print(arr[r][c]+" ");
//			}
//			System.out.println();
//		}
	}

}
