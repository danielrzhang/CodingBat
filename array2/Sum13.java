package array2;

public class Sum13 {

	public static int sum13(int[] nums) {
		int counter = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 13 && i < nums.length) {
				i++;
			} else {
				counter += nums[i];
			}
		}
		return counter;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
