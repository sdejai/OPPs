package Lec40;

//import java.io.FileReader;

public class ThrowsException {
	
	public static void calculater() throws Exception {
		divide();
	}

	public static void divide() throws Exception {
		System.out.println(2 / 0);
	}
	
	public static void main(String[] args) {
//		FileReader obj = new FileReader("/d/talk.tex");
		String name=null;
//		System.out.println(name.length());
		try {
			calculater();
		} catch (Exception e) {
			System.out.print(e);

		}
	}



}
