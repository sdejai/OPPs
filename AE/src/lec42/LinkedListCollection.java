package lec42;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCollection {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		List<Integer> ll1 = new LinkedList<Integer>();
		ll.add("laptop");
		ll.add("KeyWord");
		System.out.println(ll);
		ll.add(1,"CPU");
		System.out.println(ll);
		ll.addLast("cabel");
		System.out.println(ll);
		ll.addFirst("Processor");
		System.out.println(ll);
		for(String str : ll) {
			System.out.print(str+" -> ");
		}
		System.out.println();
		for(int i=0;i<ll.size();i++) {
			System.out.print(ll.get(i)+" ");
		}
		System.out.println();
		ll.remove(0);
		System.out.println(ll);
		ll.remove("CPU");
		System.out.println(ll);
	}

}
