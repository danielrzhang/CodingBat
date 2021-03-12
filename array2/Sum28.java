package array2;

public class Sum28 {

	public static boolean sum28(int[] nums) {
		int counter = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2) {
				counter += nums[i];
			}
		}
		return counter == 8;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
