package Lec19;

public class FiboRecursion {
	
	public static int fibo(int nth) {
		if(nth<=1) {
			return nth;
		}
		return fibo(nth-1)+fibo(nth-2);
	}
	
	public static void main(String[] args) {
		int nth=5;
		System.out.println(fibo(nth)+" ");
		for(int i=0;i<=nth;i++) {
			System.out.print(fibo(i)+" ");
		}
		
	}

}
