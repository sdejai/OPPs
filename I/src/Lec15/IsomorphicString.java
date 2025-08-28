package Lec15;

public class IsomorphicString {

	public static void main(String[] args) {
		String str1="badc";
		String str2="kike";
		for(int i=0;i<str1.length();i++) {
			char ch1=str1.charAt(i);
			char ch2=str2.charAt(i);
			for(int j=0;j<str1.length();j++) {
				if(ch1==str1.charAt(j) && str2.charAt(j)!=ch2) {
					System.out.println("Not Isomorphic String");
					return;
				}
				if(str2.charAt(j)==ch2 && str1.charAt(j)!=ch1) {
					System.out.println("Not Isomorphic String");
					return;
				}
			}
		}
		System.out.println("Isomorphic Stirng");
	}

}
