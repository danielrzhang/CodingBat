package ap1;

public class BigHeights {

	public static int bigHeights(int[] heights, int start, int end) {
		int counter = 0;
		
		for (int i = start; i < end; i++) {
			if (Math.abs(heights[i] - heights[i + 1]) >= 5) {
				counter++;
			}
		}
		return counter;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
