package Lec54;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAngram {
	public static List<List<String>> groupAnagram(String[] strs) {
		HashMap<String, List<String>> mp = new HashMap<>();
		for (String val : strs) {
			char chArr[] = val.toCharArray();
			Arrays.sort(chArr);
			String s = new String(chArr);
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
		groupAnagram(strs);
	}

}
