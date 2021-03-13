package array2;

public class ModThree {

	public static boolean modThree(int[] nums) {
		int allOdd = 0;
		int allEven = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				allEven++;
				allOdd = 0;
			} else {
				allOdd++;
				allEven = 0;
			}
			
			if (allOdd == 3 || allEven == 3) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
