package Lec46;

import java.util.HashSet;

public class SetMissMatch {

	public static int[] setMissMatch(int nums[]){
		int sumNaturalNum=(nums.length*(nums.length+1))/2;
		HashSet<Integer> hs = new HashSet<Integer>();
		int dub=0;
		for(int elm:nums) {
			if(hs.add(elm)==false) {
				dub=elm;
			}else {
				hs.add(elm);
				sumNaturalNum=sumNaturalNum-elm;
			}
		}
//		    System.out.println(dub+" "+sumNaturalNum);
		return new int[] {dub,sumNaturalNum};
	}
	public static void main(String[] args) {
		int nums[]= {1,2,2,4};
		setMissMatch(nums);
	}

}
