package Lec14;

public class UpperCase {

	public static void main(String[] args) {
		String str="naman kamaR";
		StringBuffer sb =new StringBuffer();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z') {
				ch=(char) (ch+32);
				sb.append(ch);
			}
			else {
				sb.append(ch);
			}
		}
		System.out.println(sb);
	}

}
