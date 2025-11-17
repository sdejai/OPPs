package Lec49;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber3 {
	public static int [] singleNumber(int nums[]) {
		Set<Integer> st=new HashSet<Integer>();
		for(int val:nums) {
			if(st.add(val)==false) {
				st.remove(val);
			}else {
				st.add(val);
			}	
		}
		System.out.println(st);
		int arr[] = new int[st.size()];
		int i=0;
		for(int num:st) {
			arr[i]=num;
			i++;
		}
//		System.out.println(st.add(5));
//		System.out.println(st.add(10));
//		System.out.println(st);
		return arr;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 1, 3, 2, 5 };
		singleNumber(nums);
	}

}
