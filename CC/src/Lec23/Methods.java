package Lec23;

import java.util.Scanner;

public class Methods {
	
	public int multiply(int num1,int num2) {
		int res=num1*num2;
		return res;
	}
	
	public static void main(String[] args) {
		Methods mt= new Methods();
		Scanner sc  =new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int result=mt.multiply(num1,num2);
		System.out.println(result);
	}

}
