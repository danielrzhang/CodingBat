package array1;

public class Sum2 {

	public static int sum2(int[] nums) {
		if (nums.length == 0) {
			return 0;
		} else if (nums.length == 1) {
			return nums[0];
		} else {
			return nums[0] + nums[1];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
