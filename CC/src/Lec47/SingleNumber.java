package Lec47;

import java.util.ArrayList;
import java.util.List;

public class SingleNumber {

	public static int singleNumber(int nums[]) {
		List<Integer> al = new ArrayList<Integer>();
		for(int val:nums) {
			if(al.contains(Integer.valueOf(val))) {
				al.remove(Integer.valueOf(val));
			}
			else {
				al.add(val);
			}
		}
		return al.get(0);
	}
	public static void main(String[] args) {
		int nums[]= {2,2,1};
		System.out.println(singleNumber(nums));
	}

}
