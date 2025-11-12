package Lec41;

import java.util.ArrayList;

public class SingleNumber {

	public static int singleNumber(int nums[]) {
		ArrayList<Integer> al = new ArrayList<Integer>();
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
		int nums[]= {2,2,1,3,3,5,1};
		System.out.println(singleNumber(nums));
	}

}
