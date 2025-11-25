package Lec39;

import java.util.HashSet;
import java.util.Set;

public class SingleNumberIII {

	public static void main(String[] args) {
		int nums[]= {1,2,2,4};
		Set<Integer> hs = new HashSet<Integer>();
		for(int val:nums) {
			if(hs.add(val)==false) {
				hs.remove(val);
			}
			 hs.add(val);
		}
		System.out.println(hs);
	}

}
