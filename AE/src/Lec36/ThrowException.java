package Lec36;

public class ThrowException {

	public static void main(String[] args) {
		String name=null;
		
		if(name==null) {
			throw new NullPointerException("name value is null");
		}
	}

}
