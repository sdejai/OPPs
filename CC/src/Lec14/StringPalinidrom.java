package Lec14;

public class StringPalinidrom {

	public static void main(String[] args) {
		String str="abaa";
		int st=0;
		int end=str.length()-1;
		while(st<end) {
			if(str.charAt(st)!=str.charAt(end)) {
				System.out.println("Not Palindrom!");
				return;
			}
			st++;
			end--;
		}
		System.out.println("Palindrom!");
	}

}
