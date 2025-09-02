package Lec14;

import java.util.StringTokenizer;

public class StringTokenizerProblem {

	public static void main(String[] args) {
		String str="Hey I am, a b.tech student";
		StringTokenizer st = new StringTokenizer(str,",");
		int count=0;
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			count++;
		}
		System.out.println(count);
	}

}
