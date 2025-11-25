package Lec52;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
public static int[] twoSum(int nums[],int target){
	Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
	int arr[] = new int[2];
	for(int i=0;i<nums.length;i++) {
		int find=target-nums[i];
		if(mp.containsKey(find)) {
			arr[0]=i;
			arr[1]=mp.get(find);
		}
		mp.put(nums[i],i);
	}
	System.out.println(arr[0]+" "+arr[1]);
	return arr;
}
	
	public static void main(String[] args) {
		int nums[]= {2,7,11,15};
		int target=9;
		twoSum(nums,target);
	}

}
