package array2;

public class Has77 {

	public static boolean has77(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 7 && nums[i + 1] == 7) {
				return true;
			}
		}
		
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] == 7 && nums[i + 2] == 7) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
