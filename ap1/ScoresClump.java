package ap1;

public class ScoresClump {

	public static boolean scoresClump(int[] scores) {
		for (int i = 0; i < scores.length - 2; i++) {
			if (Math.abs(scores[i] - scores[i + 1]) <= 2 && Math.abs(scores[i] - scores[i + 2]) <= 2) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
