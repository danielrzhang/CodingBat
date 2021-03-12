package array2;

public class No14 {

	public static boolean no14(int[] nums) {
		boolean containsNoOnes = true;
		boolean containsNoFours = true;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				containsNoOnes = false;
			} else if (nums[i] == 4) {
				containsNoFours = false;
			}
		}
		return containsNoOnes || containsNoFours;
	}
	
	public static void main(String[] args) {
		System.out.println(no14(new int[] {1, 2, 3}));
	}

}
