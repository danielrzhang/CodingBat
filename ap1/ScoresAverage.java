package ap1;

public class ScoresAverage {

	public static int scoresAverage(int[] scores) {
		int firstHalf = average(scores, 0, scores.length / 2);
		int secondHalf = average(scores, scores.length / 2, scores.length);
		
		if (firstHalf > secondHalf) {
			return firstHalf;
		} else {
			return secondHalf;
		}
	}
	
	public static int average(int[] scores, int start, int end) {
		int counter = 0;
		
		for (int i = start; i < end; i++) {
			counter += scores[i];
		}
		return counter / (end - start);
	}
	
	public static void main(String[] args) {
		System.out.println(scoresAverage(new int[] {5, 6}));
	}

}
