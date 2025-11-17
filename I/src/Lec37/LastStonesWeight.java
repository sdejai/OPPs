package Lec37;

import java.util.ArrayList;
import java.util.Collections;

public class LastStonesWeight {

	public static int lastStonesWeigth(int stones[]) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int num:stones) {
			al.add(num);
		}
		while(al.size()!=1) {
			int y=Collections.max(al);
//			System.out.println(al);
			al.remove(Integer.valueOf(y));
//			System.out.println(al);
			int x=Collections.max(al);
			al.remove(Integer.valueOf(x));
//			System.out.println(al);
			al.add(y-x);
//			System.out.println(al);
		}
		int res=al.get(0);
		return res;
	}
	public static void main(String[] args) {
		int stones[]= {2,7,4,1,8,1};
		System.out.println(lastStonesWeigth(stones));
	}

}
