package array1;

public class MaxEnd3 {

	public static int[] maxEnd3(int[] nums) {
		int maxNum;
		if (nums[0] >= nums[nums.length - 1]) {
			maxNum = nums[0];
		} else {
			maxNum = nums[nums.length - 1];
		}

		for (int i = 0; i < nums.length; i++) {
			nums[i] = maxNum;
		}
		return nums;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
