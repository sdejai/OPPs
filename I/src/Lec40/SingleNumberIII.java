package Lec40;

import java.util.HashSet;
import java.util.Set;

public class SingleNumberIII {
	public static int[] singleNumberIII(int nums[]) {
		Set<Integer> hs = new HashSet<Integer>();
		for(int val:nums) {
			if(hs.add(val)==false) {
				hs.remove(val);
			}else {
			  	hs.add(val);
			}
		}
		System.out.println(hs);
		int arr[]= new int[hs.size()];
		int i=0;
		for(int elm:hs) {
			arr[i]=elm;
			i++;
		}
		return arr;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 1, 3, 2, 5 };
		singleNumberIII(nums);
	}

}
