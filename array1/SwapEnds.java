package array1;

public class SwapEnds {

	public static int[] swapEnds(int[] nums) {
		if (nums.length < 2) {
			return nums;
		} else {
			int temp1 = nums[0];
			nums[0] = nums[nums.length - 1];
			nums[nums.length - 1] = temp1;
		}
		return nums;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
