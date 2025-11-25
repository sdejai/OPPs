package Lec49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

	public static void main(String[] args) {
		List<List<String>> al = new ArrayList<List<String>>();
		ArrayList<String> inDoor= new ArrayList<>();
		inDoor.add("Dog");
		inDoor.add("Cat");
		al.add(inDoor);
//		System.out.println(al);
		ArrayList<String> outDoor= new ArrayList<>();
		outDoor.add("Cow");
		outDoor.add("Elephant");
		al.add(outDoor);
//		System.out.println(al);
		Map<String,List<String>> mp = new HashMap<String, List<String>>();
		mp.put("outDoor", outDoor);
		mp.put("InDoor",inDoor);
		System.out.println(mp);
		System.out.println(mp.get("outDoor"));
		System.out.println(mp.containsKey("outDoor"));
		System.out.println(mp.keySet());
		System.out.println(mp.values());
		Map<String,List<String>> mp1 = new HashMap<String, List<String>>();
		String strs[]= {"eat","tea","tan","ate","nat","bat"};
		for(String  val:strs) {//val=bat
			char arrChar[]=new char[val.length()];
			for(int i=0;i<val.length();i++) {
				arrChar[i]=val.charAt(i);
			}
//			arrChar[]=abt;
			Arrays.sort(arrChar);
			String name= new String(arrChar);
			mp.containsKey(name);
		}
//		mp=[aet=[eat,tea,ate], ant=[tan,nat],abt=[bat]]
		mp.values();
	}

}
