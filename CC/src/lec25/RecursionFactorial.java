package lec25;

public class RecursionFactorial {

	public static int fact(int num) {
		if(num==1 || num==0) {
			return 1;
		}
		return num*fact(num-1);
	}
	
	public static void main(String[] args) {
		int num=5;
		System.out.println(fact(num));
	}

}
