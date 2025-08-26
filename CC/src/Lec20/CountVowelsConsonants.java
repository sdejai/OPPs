package Lec20;

public class CountVowelsConsonants {

	public static void main(String[] args) {
		String str = "rahul";
		int countVowels = 0;
		int countConsonants = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				countVowels++;
			} else {
				countConsonants++;
			}
		}
		System.out.println("Total Vowels " + countVowels);
		System.out.println("Total Consonants " + countConsonants);
	}

}
