package string2;

public class OneTwo {

	public static String oneTwo(String str) {
		String newString = "";

		if (str.length() < 3) {
			newString = str;
		} else {
			for (int i = 0; i < str.length(); i++) {
				if (str.length() - i > 3) {
					if (i % 3 != 0) {
						newString += str.charAt(i);
					}
					if (i % 3 == 0 && i != 0){
						newString += str.charAt(i - 3);
					}
				} else {
					newString += str.substring(i);
					break;
				}
			}
		}

		return newString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(oneTwo("tcagdosy"));

	}

}
