package Lec51;

import java.util.HashMap;
import java.util.Map;

public class MapHashMap {

	public static void main(String[] args) {
		Map<Integer,String> mp = new HashMap<Integer, String>();
		mp.put(1,"Aman");
		mp.put(2,"Arjun");
		mp.put(3,"Naman");
		mp.put(4,"Vinay");
		mp.put(5,"Vikas");
		System.out.println(mp);
//		mp.put(5,"Keshav");
		mp.put(6,"Vikas");
		System.out.println(mp);
		for(Map.Entry<Integer, String> etry:mp.entrySet()) {
			System.out.print(etry+"--->");
		}
	}

}
