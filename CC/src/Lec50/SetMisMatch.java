package Lec50;

import java.util.HashSet;
import java.util.Set;

public class SetMisMatch {
	public static int[] findErrorNums(int[] nums) {
        Set<Integer> st = new HashSet<>();
        int dublicate=0;
        int sum=(nums.length*(nums.length+1))/2;
        for(int val:nums){
            if(st.add(val)==false){
                dublicate=val;
            }
            else{
                st.add(val);
                sum=sum-val;
            }
        }
//        System.out.println(dublicate+" "+sum);
        return new int [] {dublicate,sum};
    }
	public static void main(String[] args) {
		int nums[]= {1,1};
		findErrorNums(nums);
	}

}
