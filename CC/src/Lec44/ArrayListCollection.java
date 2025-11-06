package Lec44;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCollection {

	public static void main(String[] args) {
		ArrayList<Integer> objArr = new ArrayList<Integer>();
		ArrayList<Long> objArr1 = new ArrayList<>();
		List<Integer> objArr2 = new ArrayList<>(20);
		objArr2.add(12);
		objArr2.add(15);
		objArr2.add(90);
		objArr2.add(100);
		objArr2.add(100);
		System.out.println(objArr2);
		for (int i = 0; i < objArr2.size(); i++) {
			System.out.print(objArr2.get(i) + "->");
		}
		System.out.println();
		for (int num : objArr2) {
			System.out.print(num + " -- ");
		}
//		boolean check=objArr2.remove(Integer.valueOf(12));
//		System.out.println(check);
//		objArr2.add(1, 90435);
//		System.out.println(objArr2);
//		objArr2.remove(0);
//		System.out.println(objArr2);
//		System.out.println(objArr2.get(2));
//		objArr2.set(3, 198);
//		System.out.println(objArr2);
	}

}
