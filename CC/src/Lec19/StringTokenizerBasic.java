package Lec19;

import java.util.StringTokenizer;

public class StringTokenizerBasic {

	public static void main(String[] args) {
		String str="Hey I am, B.tech student";
		StringTokenizer st= new StringTokenizer(str,",");
		int count=0;
		while(st.hasMoreTokens()) {
			count++;
			System.out.println(st.nextToken());
		}
		System.out.println(count);
	}

}
