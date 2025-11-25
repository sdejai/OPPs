package Lec48;

import java.util.HashMap;

public class TwoSum {

	public static int[] twoSum(int nums[],int target) {
		int arr[] = new int[2];
		HashMap<Integer,Integer> mp = new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++) {
			int find=target-nums[i];
			if(mp.containsKey(find)) {
				arr[0]=i;
				arr[1]=mp.get(find);
			}
			mp.put(nums[i], i);		
		}
		return arr;
	}

	public static void main(String[] args) {
		int nums[] = { 2,7,11,15};
		int target = 9;
		twoSum(nums, target);

//		for(int i=0;i<nums.length;i++) {
//			mp.put(i,nums[i]);
//		}
//		System.out.println(mp);
	}

}
