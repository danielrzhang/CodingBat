package ap1;

public class ScoreUp {

	public static int scoreUp(String[] key, String[] answers) {
		int score = 0;
		
		for (int i = 0; i < key.length; i++) {
			if (key[i].equals(answers[i])) {
				score += 4;
			} else {
				if (!answers[i].equals("?")) {
					score--;
				}
			}
		}
		return score;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
