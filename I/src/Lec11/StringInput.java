package Lec11;

import java.util.Scanner;

public class StringInput {

	public static void main(String[] args) {
		String name="Shivam";
		String name1 = new String("Abhijeet");
		String name3="Shivam";
		String name4=new String("Abhijeet");
		String name5="Abhijeet";
		String name6=new String("Abhijeet").intern();
		System.out.println(name==name3);
		System.out.println(name1==name4);
		System.out.println(name5==name6);
//		System.out.println(name);
//		System.out.println(name1);
		Scanner sc =new Scanner(System.in);
		
//		String name2=sc.nextLine();
//		System.out.println(name2);
	}

}
