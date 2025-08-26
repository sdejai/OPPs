package Lec13;

public class Angram {

	public static void main(String[] args) {
		String str1="cat";
		String str2="taca";
		int arr1[]=new int[26];
		int arr2[]=new int[26];
		for(int i=0;i<str1.length();i++) {
			++arr1[str1.charAt(i)-'a'];
		}
		for(int i=0;i<str2.length();i++) {
			++arr2[str2.charAt(i)-'a'];
		}
		for(int i=0;i<26;i++) {
			if(arr1[i]!=arr2[i]) {
				System.out.println("Not angram!");
				return;
			}
		}
		System.out.println("Angram!");
//		System.out.println(str1.toLowerCase());
//		System.out.println(str2.toUpperCase());
	}

}
