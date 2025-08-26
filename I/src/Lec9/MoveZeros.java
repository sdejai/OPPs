package Lec9;

public class MoveZeros {
	public static void main(String[] args) {
		int num[]= {0,1,0,3,12};
		int nonZeroIndex=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]!=0) {
				num[nonZeroIndex]=num[i];
				nonZeroIndex++;
			}
		}
		while(nonZeroIndex<num.length) {
			num[nonZeroIndex]=0;
			nonZeroIndex++;
		}
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
	}
}
