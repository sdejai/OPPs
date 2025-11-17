package Lec44;

import java.util.HashSet;
import java.util.Set;

public class CountDublicate {
	
	public static void printMethod(Set<Integer> hs) {
		System.out.println(hs);
	}

	public static int count(int arr[]) {
		Set<Integer> st = new HashSet<Integer>();
		for (int val : arr) {
			st.add(val);
		}
		printMethod(st);
		return arr.length - st.size();
	}

	public static void main(String[] args) {
		int arr[] = { 2, 2, 3, 11, 11, 11, 3, 3, 3, 4, 5, 6, 7, 7, 0, 0, 0 };
		System.out.println(count(arr));
	}

}
