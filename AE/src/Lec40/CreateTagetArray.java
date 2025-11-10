package Lec40;

import java.util.ArrayList;

public class CreateTagetArray {
	public static int[] createTarget(int nums[],int index[]) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		int target[] = new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			al.add(index[i],nums[i]);
//			System.out.println(al);
		}
		for(int i=0;i<al.size();i++) {
			target[i]=al.get(i);
		}
		return target;
	}
	public static void main(String[] args) {
		int nums[]= {0,1,2,3,4};
		int index[]= {0,1,2,2,1};
		createTarget(nums,index);
	}
}
