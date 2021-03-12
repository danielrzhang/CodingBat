package array2;

public class Sum67 {

	public static int sum67(int[] nums) {
		int counter = 0;
		boolean meet67 = false;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 6) {
				if (!meet67) {
					counter += nums[i];
				} else {
					if (nums[i] == 7) {
						meet67 = false;
					}
				}
				
			} else {
				meet67 = true;
			}
		}
		
		return counter;
	}
	
	public static void main(String[] args) {
		System.out.println(sum67(new int[] {1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7}));

	}

}
