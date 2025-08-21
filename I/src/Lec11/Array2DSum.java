package Lec11;

public class Array2DSum {

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 5 }, { 23, 45, 2 }, { 1, 7, 9 } };
		int sum=0;
		for(int r=0;r<arr.length;r++) {
			for(int c=0;c<arr[0].length;c++) {
				sum=sum+arr[r][c];
			}
		}
		System.out.println(sum);
	}

}
