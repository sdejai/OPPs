package Lec7;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				System.out.println(i +" is even");
			}
			else {
				System.out.println(i +" is odd");
			}
		}
	}

}
