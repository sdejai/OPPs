package Lec9;

public class LocalGlobalScope {
	int number1=10;
//	var num1=10;
	public static void main(String[] args) {
		var num=11;
		for(int i=0;i<5;i++) {
			System.out.print(num+" ");
		}
		System.out.println();
	}

}
