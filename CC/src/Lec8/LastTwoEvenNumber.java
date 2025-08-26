package Lec8;

import java.util.Scanner;

public class LastTwoEvenNumber {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		int counter=0;
		for(int i=num-1;i>=1;i=i-1) {
			if(i%2==0) {
				System.out.println(i);
				counter++;
			}
			if(counter==2) {
				break;
			}
		}
	}

}
