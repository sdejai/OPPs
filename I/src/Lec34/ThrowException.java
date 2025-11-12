package Lec34;

public class ThrowException {

	public static void main(String[] args) throws Exception {
//		int arr[]= {12,23,4,5};
//		if(arr.length)
//		int result=arr[4];
		String str=null;
		if(str==null) {
			throw new Exception("Hey");
		}else {
			System.out.println(str.length());
		}
//		try {
//			System.out.println(str.length());
//		} catch (Exception e) {
//			System.out.println(e);
//		}		
		
		
	}

}
