package Lec13;

public class StringReverse {

	public static void main(String[] args) {
		String str="Aman";
		StringBuffer sb = new StringBuffer();
		for(int i=str.length()-1;i>=0;i--) {
			sb.append(str.charAt(i));
		}
		System.out.println(sb);
	}

}
