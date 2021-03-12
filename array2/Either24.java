package array2;

public class Either24 {

	public static boolean either24(int[] nums) {
		boolean twoNext = false;
		boolean fourNext = false;
		
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 2 && nums[i + 1] == 2) {
				twoNext = true;
			} else if (nums[i] == 4 && nums[i + 1] == 4) {
				fourNext = true;
			}
		}
		return twoNext ^ fourNext;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
