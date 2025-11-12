package Lec46;

import java.util.LinkedList;
import java.util.List;

public class Llist {

	public static void main(String[] args) {
//		LinkedList<String> ll = new LinkedList<>();
		List<String> ll = new LinkedList<String>();
		ll.add("Pen");
		ll.add("Paper");
		ll.add("Laptop");
		ll.add("Keyword");
		System.out.println(ll);
		ll.add(0,"CPU");
		System.out.println(ll);
		ll.addFirst("Moniter");
		ll.addLast("Backup Battery");
		System.out.println(ll);
		ll.remove(0);
		System.out.println(ll);
		ll.remove("Pen");
		System.out.println(ll);
		for(String name:ll) {
			System.out.println("Linked List "+name);
		}
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
	}

}
