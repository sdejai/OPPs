package Lec39;

import java.util.HashSet;

public class CountDublicate {

	public static void main(String[] args) {
		int arr[]= {2,3,2,5,3,3,5,5,7,8,2};
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int val:arr) {
			hs.add(val);
		}
		System.out.println(hs);
		System.out.println(arr.length-hs.size());
	}

}
