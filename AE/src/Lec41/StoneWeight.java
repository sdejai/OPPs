package Lec41;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StoneWeight {
	public static int lastStoneWeight(int stone[]) {
		List<Integer> al = new ArrayList<Integer>();
		for (int num : stone) {
			al.add(num);
		}
		while (al.size()!=1) {
			int y=Collections.max(al);
			al.remove(Integer.valueOf(y));
			int x=Collections.max(al);
			al.remove(Integer.valueOf(x));
			al.add(y-x);
		}
		return al.get(0);
	}

	public static void main(String[] args) {
		int stone[] = { 2, 7, 4, 1, 8, 1 };
		System.out.println(lastStoneWeight(stone));
	}

}
