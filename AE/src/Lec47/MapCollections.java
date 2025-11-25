package Lec47;

import java.util.HashMap;
import java.util.Map;

public class MapCollections {

	public static void main(String[] args) {
//		Map<Integer,String> mapObj1 = new HashMap<Integer, String>();
		HashMap mp = new HashMap();
		HashMap<Integer,String> mapObj = new HashMap<Integer, String>();
		mapObj.put(1,"Aman");
		mapObj.put(2, "Aryan");
		mapObj.put(3, "Arjun");
		mapObj.put(4, "Ramu");
		System.out.println(mapObj);
		mapObj.put(5, "Aman");
//		mapObj.put(1, "RAM");
		System.out.println(mapObj);
		System.out.println(mapObj.containsKey(12));
		System.out.println(mapObj.containsValue("Aman"));
		Map<String,String> hmap = new HashMap<String, String>();
		hmap.put("Aman","Kumar");
		hmap.put("Coding","blocks");
		hmap.put("Rajeev","Rana");
		System.out.println(hmap);
		System.out.println(hmap.keySet());
		System.out.println(hmap.values());
//		for(String name:hmap) {
//			sysout(name);
//		}
		for(Map.Entry<String, String >val:hmap.entrySet()) {
			System.out.print(val+" --->");
		}
	}

}
