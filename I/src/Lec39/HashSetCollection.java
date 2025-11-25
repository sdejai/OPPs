package Lec39;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetCollection {

	public static void main(String[] args) {
		Set<String> hs1 = new HashSet<String>();
		HashSet<String> hs = new HashSet<String>();
		System.out.println(hs.add("Delhi"));
		System.out.println(hs.add("Delhi"));
		hs.add("Agra");
		hs.add("Mathura");
		hs.add("Lucknow");
		System.out.println(hs);
		hs.remove("Delhi");
		System.out.println(hs);
		
	}

}
