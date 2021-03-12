package array2;

public class MatchUp {

	public static int matchUp(int[] nums1, int[] nums2) {
		
		int counter = 0;
		
		for (int i = 0; i < nums1.length; i++) {
			if (Math.abs(nums1[i] - nums2[i]) <= 2 && Math.abs(nums1[i] - nums2[i]) > 0) {
				counter++;
			}
		}
		return counter;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
