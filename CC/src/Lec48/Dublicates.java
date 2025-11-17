package Lec48;

import java.util.HashSet;
import java.util.Set;

public class Dublicates {

	public static void main(String[] args) {
		int arr[]= {22,22,44,44,44,6,6,6,1,8,23,23};
		int oputArr[]= {22,44,6,1,8,23};
		Set<Integer> hs = new HashSet<Integer>();
		for(int val:arr) {
			hs.add(val);
		}
		System.out.println(hs);
		System.out.println(arr.length-hs.size());
		hs.remove(44);
		System.out.println(hs);
		System.out.println(hs.contains(8));
	}

}
