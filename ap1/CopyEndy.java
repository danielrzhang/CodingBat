package ap1;

public class CopyEndy {

	public static int[] copyEndy(int[] nums, int count) {
		int[] newArray = new int[count];
		
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (isEndy(nums[i])) {
				if (index < count) {
					newArray[index] = nums[i];
					index++;
				} else {
					break;
				}
			}
		}
		return newArray;
	}
	
	public static boolean isEndy(int n) {
		if ((n >= 0 && n <= 10) || (n >= 90 && n <= 100)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
