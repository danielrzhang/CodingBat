package array2;

public class Has12 {

	public static boolean has12(int[] nums) {
		boolean found1 = false;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				found1 = true;
			} else if (found1 && nums[i] == 2) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
