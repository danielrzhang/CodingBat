package array2;

public class BigDiff {

	public static int bigDiff(int[] nums) {
		int largestNum = Integer.MIN_VALUE;
		int smallestNum = Integer.MAX_VALUE;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > largestNum) {
				largestNum = nums[i];
			}
			
			if (nums[i] < smallestNum) {
				smallestNum = nums[i];
			}
		}
		return largestNum - smallestNum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
