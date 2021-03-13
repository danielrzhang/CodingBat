package array2;

public class NotAlone {

	public static int[] notAlone(int[] nums, int val) {
		for (int i = 1; i < nums.length - 1; i++) {
			if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1] && nums[i] == val) {
				nums[i] = Math.max(nums[i - 1], nums[i + 1]);
			}
		}
		return nums;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
