package ap1;

public class ScoresIncreasing {

	public static boolean scoresIncreasing(int[] scores) {
		for (int i = 0; i < scores.length - 1; i++) {
			if (scores[i] > scores[i + 1]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
