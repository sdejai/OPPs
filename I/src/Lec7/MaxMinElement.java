package Lec7;

public class MaxMinElement {

	public static void main(String[] args) {
		int arr[]= {12,3,56,8,98,5};
		int maxValue=Integer.MIN_VALUE;
		int minValue=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxValue) {
				maxValue=arr[i];
			}
			else if(arr[i]<minValue) {
				minValue=arr[i];
			}
		}
		System.out.println("max Element "+ maxValue);
		System.out.println("min Element "+minValue);
	}

}
