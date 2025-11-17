package Lec45;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber3 {
	public static int[] singleNumber(int nums[]){
		Set<Integer> stm = new HashSet<Integer>();
		for(int val:nums) {
			if(stm.add(val)==false) {
				stm.remove(val);
			}else {
				stm.add(val);
			}
		}
		int arr[] =new int[stm.size()];
		int i=0;
		for(int val:stm) {
			arr[i]=val;
			i++;
		}
	return arr;
}
	public static void main(String[] args) {
//		Set<Integer> stm = new HashSet<Integer>();
//		System.out.println(stm.add(1));
//		System.out.println(stm.add(1));
//		System.out.println(stm);
		int nums[]= {1,2,1,3,2,5};
		singleNumber(nums);
	}

}
