package Lec38;

import java.util.StringTokenizer;

public class WrapperClasses {

	public static void main(String[] args) {
		
//		Auto Boxing 
		int num=100;
		Integer wI=new Integer(num);
		Integer wI1=num;
		Integer wI2=Integer.valueOf(num);
		
//		Unboxing 
		Integer num1= 101;
		int val=num1;
		int val1=num1.intValue();
		
	}

}
