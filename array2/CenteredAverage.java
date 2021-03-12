package array2;

public class CenteredAverage {

	public static int centeredAverage(int[] nums) {
		int largestNum = Integer.MIN_VALUE;
		int smallestNum = Integer.MAX_VALUE;
		int largeIndex = 0;
		int smallIndex = 0;
		int counter = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > largestNum) {
				largestNum = nums[i];
				largeIndex = i;
			} 
			
			if (nums[i] < smallestNum) {
				smallestNum = nums[i];
				smallIndex = i;
			}
		}
		
		for (int i = 0; i < nums.length; i++) {
			if (!(nums[i] == largestNum && largeIndex == i) && !(nums[i] == smallestNum && smallIndex == i)) {
				System.out.println(i);
				counter += nums[i];
			} 
		}
		
		if (largestNum == smallestNum) {
			return counter / (nums.length - 1);
		} else {
			return counter / (nums.length - 2);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(centeredAverage(new int[] {7, 7, 7}));
	}

}
