package Lec9;

import java.util.Scanner;

public class PascalTrangle {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		var value="String";
		int row=0;
		int star=1;
		while(row<n) {
			int col=0;
			int val=1;
			while(col<star) {
				System.out.print(val+" ");
				val=(val*(row-col))/(col+1);
				col++;
			}
			System.out.println();
			star++;
			row++;
		}
	}

}
