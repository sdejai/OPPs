package Lec20;

public class CountVowelsConsonants {

	public static void main(String[] args) {
		String str="abcieou";
		int vowelsCount=0;
		int consonantsCount=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' 
					||str.charAt(i)=='e' 
					||str.charAt(i)=='i' 
					||str.charAt(i)=='o' 
					||str.charAt(i)=='u') {
				
				vowelsCount++;
			}
			else {
				consonantsCount++;
			}
		}
		System.out.println("Vowels count is "+vowelsCount);
		System.out.println("Consonants count is "+consonantsCount);
	}

}
