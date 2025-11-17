package Lec36;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCollections {

	public static void main(String[] args) {
		ArrayList<Character> al = new ArrayList<>();
//		List<Character> al1 = new ArrayList<>();
		al.add('a');
		al.add('b');
		al.add('c');
		System.out.println(al);
		System.out.println(al.size());
		al.add(0,'z');
		System.out.println(al);
		
	}

}
