package Lec9;

public class PrivotIndex {

	public static void main(String[] args) {
		int nums[]= {1,7,3,6,5,6};
		int totalArraySum = 0;
		for (int i = 0; i < nums.length; i++) {
			totalArraySum = totalArraySum + nums[i];
		}
		int leftSideSum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (leftSideSum == totalArraySum - (leftSideSum + nums[i])) {
				System.out.println("Privot index "+ i);
				return;
			}
			leftSideSum = leftSideSum + nums[i];
		}
		System.out.println("-1");
	}

}
