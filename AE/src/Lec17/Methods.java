package Lec17;

public class Methods {
	
	public int sum(int val1,int val2) {
		int total=val1+val2;
		return total;
	}
	public void subtract(int num1,int num2) {
		System.out.println(num2-num1);
	}
	
	public static void main(String[] args) {
		Methods obj = new Methods();
		int num1=10;
		int num2=18;
		int result=obj.sum(num1,num2);
		System.out.println(result);
		obj.subtract(num1, num2);
	}

}
