package array2;

public class ZeroMax {

	public static int[] zeroMax(int[] nums) {
		int maxOdd = 0;
		
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] % 2 == 1 && maxOdd < nums[i]) {
				maxOdd = nums[i];
			} else if (nums[i] == 0) {
				nums[i] = maxOdd;
			}
		}
		return nums;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
