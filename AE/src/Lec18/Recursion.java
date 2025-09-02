package Lec18;

public class Recursion {
	public static int fact(int num) {
		if(num==0 || num==1) {
			return 1;
		}
		return num*fact(num-1);
	}
	public static void main(String[] args) {
		int num=3;
		System.out.println(fact(num));
	}

}
