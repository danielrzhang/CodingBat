package ap1;

public class ScoresSpecial {

	public static int scoresSpecial(int[] a, int[] b) {
		return findSpecial(a) + findSpecial(b);
	}
	
	public static int findSpecial(int[] scores) {
		int maxScore = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > maxScore && scores[i] % 10 == 0) {
				maxScore = scores[i];
			}
		}
		return maxScore;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
