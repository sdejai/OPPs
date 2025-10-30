package Lec39;

public class Excep {

	public static void main(String[] args) {
		int num1=10;
		int num2=0;
//		try {
//			int result=num1/num2;
//		} 
//		catch (Exception e) {
//			System.out.println(e);
//		}
		
		int arr[]= {12,34,56,3,2};
		
		try {
			for(int i=0;i<=arr.length;i++) {
				System.out.println(arr[i]+" ");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("hello Class");
		System.out.println("hey");
	}

}
