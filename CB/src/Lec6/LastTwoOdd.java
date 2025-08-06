package Lec6;

import java.util.Scanner;

public class LastTwoOdd {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num=sc.nextInt();
	int counter=0;
	for(int i=num-1;i>0;i--) {
		if(i%2!=0) {
			System.out.println(i+" odd number");
			counter++;
		}
		if(counter==2) {
			break;
		}
	}
}

}
