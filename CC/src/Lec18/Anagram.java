package Lec18;

public class Anagram {

	public static void main(String[] args) {
		String str1="cataa";
		String str2="tac";
		int arr1[]=new int[26];
		int arr2[]=new int[26];
		if(str1.length()!=str2.length()) {
			System.out.println("Not anagram!");
			return;
		}
		for(int i=0;i<str1.length();i++) {
			++arr1[str1.charAt(i)-'a'];
		}
		for(int i=0;i<str2.length();i++) {
			++arr2[str2.charAt(i)-'a'];
		}
		for(int i=0;i<26;i++) {
			if(arr1[i]!=arr2[i]) {
				System.out.println("Not anagram!");
				return;
			}
		}
		System.out.println("Angram!");
	}

}
