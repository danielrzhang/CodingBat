package ap1;

public class CopyEvens {

	public static int[] copyEvens(int[] nums, int count) {
		int[] newArray = new int[count];
		
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
