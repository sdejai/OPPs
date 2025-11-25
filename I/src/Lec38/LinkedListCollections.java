package Lec38;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCollections {

	public static void main(String[] args) {
		List<String> ll1 = new LinkedList<String>();
		LinkedList<String> ll = new LinkedList<String>();
		System.out.println(ll.add("Laptop"));
		
		ll.add("Cable");
		ll.add("CPU");
		System.out.println(ll);
		ll.add(1, "Moniter");
		System.out.println(ll);
		for(int i=0;i<ll.size();i++) {
			System.out.print(ll.get(i)+" ");
		}
		ll.remove("CPU");
		System.out.println();
		System.out.println(ll);
		ll.remove(1);
		System.out.println(ll);
		System.out.println(ll.contains("Cable"));
		System.out.println(ll.contains("CPU"));
		for(String val:ll) {
			System.out.println(val);
		}
	}

}
