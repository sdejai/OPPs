package Lec37;

import java.util.ArrayList;
import java.util.List;


public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(10);
		list.add(13);
		list.add(15);
		System.out.println(list);
		list.add(1,3);
		System.out.println(list);
		System.out.println(list.size());
//		list.remove(15);
		list.remove(Integer.valueOf(13));
		System.out.println(list);
		List<String> ls= new ArrayList<String>();
		ls.add("Laptop");
		ls.add("CPU");
		ls.add(0,"Moniter");
		System.out.println(ls);
//		System.out.println(ls.remove(0));
		System.out.println(ls);
//		ls.remove("CPU");
		System.out.println(ls);
		System.out.println(ls.get(0));
		ls.set(0, "Memnory");
		System.out.println(ls);
	}

}
