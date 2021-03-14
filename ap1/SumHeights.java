package ap1;

public class SumHeights {

	public static int sumHeights(int[] heights, int start, int end) {		
		int counter = 0;
		
		for (int i = start; i < end; i++) {
			counter += Math.abs(heights[i] - heights[i + 1]);
		}
		return counter;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
