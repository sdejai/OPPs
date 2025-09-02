package Lec17;

public class Factorial {
	public static int fact(int num) {
		int res=1;
		for(int i=num;i>=1;i--) {
			res=res*i;
		}
		return res;
	}
	
	public static void main(String[] args) {
		int num=5;
		System.out.println(fact(num));
	}

}
