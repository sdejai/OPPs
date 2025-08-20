package Lec14;

import java.util.Scanner;

public class StringInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name="Aman";
		System.out.println(name);
		String name1=new String("Naman");
		System.out.println(name1);
		String studentName=sc.nextLine();
		System.out.println(studentName);
		for(int i=0;i<name.length();i++) {
			System.out.print(name.charAt(i)+" ");
		}
	}

}
