package Lec50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAngram {
	public static List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, List<String>> mp = new HashMap<>();
		for (String val : strs) {
			char ch[] = val.toCharArray();
			Arrays.sort(ch);
			String s = new String(ch);
			if (!mp.containsKey(s)) {
				mp.put(s, new ArrayList<>());
			}
			mp.get(s).add(val);
		}
//		System.out.println(mp.values());
		return new ArrayList<>(mp.values());
	}

	public static void main(String[] args) {
		String strs[] = new String[] {"eat","tea","tan","ate","nat","bat"};
		groupAnagrams(strs);
	}

}
