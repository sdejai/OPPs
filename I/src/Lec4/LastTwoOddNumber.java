package Lec4;

import java.util.Scanner;

public class LastTwoOddNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		for(int i=num-1;i>0;i--) {
			if(i%2!=0) {
				System.out.print(i+" ");
				count=count+1;//count++;
			}
			if(count==2) {
				break;
			}
		}
	}

}
