package lec25;

public class RecursionFibonacieSeries {

	public static int fibo(int n) {
		if(n<=1) {
			return n;
		}
		return fibo(n-1)+fibo(n-2);
	}
	
	public static void main(String[] args) {
		int nOrder=5;
		System.out.println(fibo(nOrder));
	}

}
