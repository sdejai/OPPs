package Lec43;

import java.util.HashSet;
import java.util.Set;

public class HashSetCollection {
	
	public static void main(String[] args) {
//		HashSet<String> hs = new HashSet<>();
		Set<String> hs1 = new HashSet<>();
		hs1.add("Delhi");
		hs1.add("Delhi");
		hs1.add("Agra");
		hs1.add("Agra");
		hs1.add("Lucknow");
		hs1.add("Lucknow");
		System.out.println(hs1);
		hs1.remove("Lucknow");
		System.out.println(hs1);
//		System.out.println(hs1.get(0));
		System.out.println(hs1.size());
		for(String val:hs1) {
			System.out.print(val+" ");
		}
	}
}
