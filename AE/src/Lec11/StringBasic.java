package Lec11;

import java.util.Scanner;

public class StringBasic {

	public static void main(String[] args) {
		String name="Aman";
		String name1=new String("Aman").intern();
		String name3="Aman";
		String name4=new String("Aman");
		System.out.println(name==name1);
		System.out.println(name==name3);
		System.out.println(name1==name4);
		Scanner sc = new Scanner(System.in);
		String  city =sc.nextLine();
		System.out.println(city);
		char ch =sc.next().charAt(0);
		System.out.println(city.charAt(0));
		for(int i=0;i<city.length();i++) {
			System.out.println(city.charAt(i));
		}
	}

}
