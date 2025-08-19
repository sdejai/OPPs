package Lec13;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 6, 8 }, { 12, 54, 76 } };
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int arr1[][] = new int[row][col];
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < col; c++) {
				arr1[r][c] = sc.nextInt();
			}
		}
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < col; c++) {
				System.out.print(arr1[r][c]+" ");
			}
			System.out.println();
		}
	}

}
