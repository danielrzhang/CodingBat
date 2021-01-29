package warmup2;

public class StringMatch {

	public static int stringMatch(String a, String b) {

		String subA, subB;
		int counter = 0;
		for (int i = 0; i <= Math.min(a.length(), b.length()) - 2; i++) {
			subA = a.substring(i, i + 2);
			subB = b.substring(i, i + 2);

			System.out.println(subA + " " + subB);
			if (subA.equals(subB)) {
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		stringMatch("xxcaazz", "xxbaaz");
	}

}
