package Lec35;

public class WrapperClasses {

	public static void main(String[] args) {
		//AutoBoxing
		int i=101;
		Integer iW=i;
		//Integer iW1=new Integer(i);  after 9 it's depr
		Integer iW2=Integer.valueOf(i);
		System.out.println(i);
		System.out.println(iW);
		System.out.println(iW2);
		
		//UnBoxing
		Character cW='a';
		char c=cW;
		Integer wI = 10000;
		int num=wI;
		int num1=wI.intValue();
		System.out.println(cW);
		System.out.println(c);
		System.out.println(num);
		System.out.println(num1);
		System.out.println(wI);
		
	}

}
