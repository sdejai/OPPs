package Lec17;

public class Methods {
	
	public int div(int val1,int val2) {
		int result=val1/val2;
		return result;
	}
	
	public static void main(String[] args) {
		Methods obj = new Methods();
		int num1=50;
		int num2=5;
		int store=obj.div(num1,num2);
		System.out.println(store);
	}

}
