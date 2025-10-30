package Lec39;

public class TaskPerform {

	public static void main(String[] args) {
		FunctionalInter ref =(num1,num2)->num1+num2;
		FunctionalInter ref1 =(num1,num2)->num1+num2;
//		FunctionalInter ref1=(num1,num2)->num1*num2;
		System.out.println(ref.add(2,3));
//		System.out.println(ref1.add(2,4));
	}
}
