package Lec1;

import java.util.Scanner;

public class PascalTrangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int row=0;
		int star=1;
		while(row<n) {
			int value=1;
			int col=0;
			while(col<star) {
				System.out.print(value+" ");
				value=((row-col)*value)/(col+1);
				col++;
			}
			System.out.println();
			star++;
			row++;
		}
	}

}
