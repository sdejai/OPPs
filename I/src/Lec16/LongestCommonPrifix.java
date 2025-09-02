package Lec16;

import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrifix {
	public static void main(String[] args) {
		String arr[] = { "hi", "hey", "hello", "he" };
		Arrays.sort(arr);
//		int lenOfZeroIndex=arr[0].length();
//		int lenOfLastIndex=arr[arr.length-1].length();
		int len = Math.min(arr[0].length(), arr[arr.length - 1].length());
		int i = 0;
		while (i < len && arr[0].charAt(i) == arr[arr.length - 1].charAt(i)) {
			i++;
		}
		String result = arr[0].substring(0, i);
		System.out.println(result);
	}
}
