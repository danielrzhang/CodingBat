package array2;

public class TwoTwo {

	public static boolean twoTwo(int[] nums) {
		if (nums.length == 1 && nums[0] == 2) {
			return false;
		}
		
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 2 && nums[i + 1] == 2 && i < nums.length - 1) {
				i++;
			} else if (nums[i] == 2 && nums[i + 1] != 2) {
				return false;
			} else if (nums[nums.length - 2] != 2 && nums[nums.length - 1] == 2) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
