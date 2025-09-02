package Lec23;

public class Factorial {
 
	public int fact(int num) {
		int mul=1;
		for(int i=num;i>=1;i--) {
			mul=mul*i;
		}
		return mul;
	}
	
	public static void main(String[] args) {
		Factorial fb = new Factorial();
		System.out.println(fb.fact(4));
//		fb.fact(4);
	}

}
