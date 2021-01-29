package warmup2;

public class AltPairs {

	public static String altPairs(String str) {
		String newString = "";
		boolean checkNum = true;

		for (int i = 0; i < str.length(); i++) {
			newString += str.charAt(i);
			if (!checkNum) {
				i += 2;
				checkNum = true;
			} else {
				checkNum = false;
			}
		}
		return newString;
	}

	public static void main(String[] args) {
		System.out.println(altPairs("kitten"));
		System.out.println(altPairs("Chocolate"));
		System.out.println(altPairs("CodingHorror"));
	}

}
