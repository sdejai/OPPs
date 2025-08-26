package Lec7;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		System.out.println("Not Enter Zero in number 2 if you are selecting div");
		int num2=sc.nextInt();
		char opretor=sc.next().charAt(0);
		switch (opretor) {
		case '+': {
			System.out.println("Sum is "+(num1+num2));
			break;
		}
		case '-': {
			System.out.println("Sub is "+ (num1-num2));
			break;
		}
		case '/': {
			System.out.println("Div is "+ (num1/num2));
			break;
		}
		case '*': {
			System.out.println("Multi is "+ (num1*num2));
			break;
		}
		default:
			System.out.println("Not right opration");
		}
	}

}
