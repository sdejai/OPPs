package Lec6;
import java.util.Scanner;

public class CondiStatment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num>10) {
			System.out.println("Given Number is greater than Ten");
		}
		else {
			System.out.println("Given Number is less than Ten");
		}
	}

}
