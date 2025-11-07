package Lec39;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraListMethods {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
		List<Integer> al = new ArrayList<Integer>();
//		al.add(sc.nextInt());
		al.add(10);
		al.add(12);
//		System.out.println(al.get(2));
//		System.out.println(al);
//		for(int i=0;i<al.size();i++) {
//			System.out.print(al.get(i)+" ");
//		}
		al.add(0, 101);
		al.add(1, 11);
//		System.out.println(al);
		al.set(3, 89);
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
		al.remove(Integer.valueOf(10));
		System.out.println(al);
	}

}
