package Lec13;

public class Anagram {

	public static void main(String[] args) {
		String str1="cat";
		String str2="tat";
		int arr1[]=new int[26];
		int arr2[]=new int[26];
		if(str1.length()!=str2.length()) {
			System.out.println("Not Anagram");
			return;
		}
		for(int i=0;i<str1.length();i++) {
			++arr1[str1.charAt(i)-'a'];
			//arr1[str1.charAt(i)-'a']=arr1[str1.charAt(i)-'a']+1;
		}
		for(int i=0;i<str2.length();i++) {
			++arr2[str2.charAt(i)-'a'];
			//arr2[str2.charAt(i)-'a']=arr2[str2.charAt(i)-'a']+1;
		}
		for(int i=0;i<26;i++) {
			if(arr1[i]!=arr2[i]) {
				System.out.println("Not Anagram");
				return;
			}
		}
		System.out.println("Anagarm");
	}

}
