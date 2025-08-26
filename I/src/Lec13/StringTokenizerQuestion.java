package Lec13;

import java.util.StringTokenizer;

public class StringTokenizerQuestion {

	public static void main(String[] args) {
//		String str="Hey I am a student!";
		String str="Hey I am, a student!";
//		StringTokenizer st = new StringTokenizer(str," ");
		StringTokenizer st = new StringTokenizer(str,",");
		int countWords=0;
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement());
			countWords++;
		}
		System.out.println(countWords);
	}

}
