package Lec19;

public class FiboSeries {

	public static void main(String[] args) {
		int nOrder=3;
		int num1=0;
		int num2=1;
		for(int i=0;i<=nOrder;i++) {
			System.out.print(num1+ " ");
			int sum=num1+num2;
			num1=num2;
			num2=sum;
		}
	}

}
