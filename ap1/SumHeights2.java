package ap1;

public class SumHeights2 {

	public static int sumHeights2(int[] heights, int start, int end) {
		int counter = 0;
		
		for (int i = start; i < end; i++) {
			if (heights[i] < heights[i + 1]) {
				counter += 2 * (heights[i + 1] - heights[i]);
			} else {
				counter += heights[i] - heights[i + 1];
			}
		}
		return counter;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
