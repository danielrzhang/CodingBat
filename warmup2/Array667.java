package warmup2;

public class Array667 {

	public static int array667(int[] nums) {
		int counter = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		System.out.println(array667(new int[] { 6, 6, 2 }));
		System.out.println(array667(new int[] { 6, 6, 2, 6 }));
		System.out.println(array667(new int[] { 6, 7, 2, 6 }));

	}

}
