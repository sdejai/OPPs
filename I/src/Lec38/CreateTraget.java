package Lec38;

import java.util.ArrayList;

public class CreateTraget {

	private static int[] createTargetArr(int nums[], int indexs[]) {
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
//			int inx = indexs[i];
//			int val = nums[i];
//			arrList.add(inx, val);
			arrList.add(indexs[i], nums[i]);
		}
		int arr[] = new int[arrList.size()];
		int i = 0;
		for (int val : arrList) {
			arr[i] = val;
			i++;
		}
//		System.out.println(arrList);
		return arr;
	}

	public static void main(String[] args) {

		int nums[] = { 0, 1, 2, 3, 4 };
		int indexs[] = { 0, 1, 2, 2, 1 };
		createTargetArr(nums, indexs);

	}

}
