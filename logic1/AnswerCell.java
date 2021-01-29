package logic1;

public class AnswerCell {

	public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		if (isAsleep) {
			return false;
		} else if (isMorning){
			if (isMom) {
				return true;
			} else {
				return false;
			}
		} else {
			return true;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
