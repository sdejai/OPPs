package Lec7;
import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.println("Loop is runing "+ i);
		}
	}

}
