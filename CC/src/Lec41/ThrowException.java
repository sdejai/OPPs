package Lec41;

public class ThrowException {

	public static void main(String[] args) {
		String str=null;
		if(str==null) {
			throw new NullPointerException("String has null value ");
		}
	}

}
