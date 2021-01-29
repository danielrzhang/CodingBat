package logic1;

public class WithoutDoubles {

	public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
		if (!noDoubles) {
			return die1 + die2;
		} else {
			if (die1 == die2) {
				die1++;
				if (die1 > 6) {
					die1 = 1;
				}
				return die1 + die2;
			} else {
				return die1 + die2;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
