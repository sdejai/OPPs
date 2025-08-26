package Lec9;

public class MoveZeroes {

	public static void main(String[] args) {
		int nums[]= {0,1,0,3,12};
		int nonZeroIndex=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				nums[nonZeroIndex]=nums[i];
				nonZeroIndex++;
			}
		}
		for(int i=nonZeroIndex;i<nums.length;i++) {
			nums[i]=0;
		}
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
	}

}
