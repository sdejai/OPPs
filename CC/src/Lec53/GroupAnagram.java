package Lec53;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
	public static void main(String[] args) {
		List<List<String>> listList = new ArrayList<List<String>>();
		List<String> outDoor = new ArrayList<String>();
		List<String> inDoor = new ArrayList<String>();
		outDoor.add("Elephant");
		outDoor.add("Cow");
		inDoor.add("Dog");
		inDoor.add("Cat");
		listList.add(outDoor);
		listList.add(inDoor);
		System.out.println(outDoor);
		System.out.println(inDoor);
		System.out.println(listList);
		
		Map<String,List<String>> map = new HashMap<String, List<String>>();
		map.put("Indoor",inDoor);
		map.put("OutDoor", outDoor);
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
	}
}
