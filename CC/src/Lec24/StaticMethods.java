package Lec24;

public class StaticMethods {
	public static void fact(int num) {
		int result=1;
		for(int i=num;i>=1;i--) {
			result=result*i;
		}
		System.out.println(result);
	}
	public static void main(String[] args) {
		int num=3;
		fact(num);
	}

}
