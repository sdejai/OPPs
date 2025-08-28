package Lec21;

public class ToUpperCaseCode {

	public static void main(String[] args) {
		String str="naman Kumar";
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z') {
				ch=(char) (ch-32);
				sb.append(ch);
			}
			else {
				sb.append(ch);
			}
		}
		System.out.println(sb);
	}

}
