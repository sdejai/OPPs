package Lec33;

public class Add {
	public static void main(String[] args) {
	FuncInterface ref =(num1,num2)->num1+num2;
//	FuncInterface ref1 =(num1)->num1*2  ;	
		
		System.out.println(ref.add(2,3));
	}
}
