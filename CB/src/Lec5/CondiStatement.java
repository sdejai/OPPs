package Lec5;
import java.util.Scanner;

public class CondiStatement {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		float marksPer =sc.nextFloat();
		if(marksPer>=95) {
			System.out.println("Exc");
		}
		else if(marksPer>85 && marksPer<95) {
			System.out.println("Good");
		}
		else {
			System.out.println("thik h!");
		}
	}

}
