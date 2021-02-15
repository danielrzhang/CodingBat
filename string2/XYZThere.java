package string2;

public class XYZThere {

	public static boolean xyzThere(String str) {
		String check;
		boolean hasXYZ = false;
		boolean hasDotXYZ = false;

		if (str.length() < 3) {
			return hasXYZ;
		} else if (str.equals("xyz")) {
			return true;
		} else {
			for (int i = 0; i < str.length() - 2; i++) {
				check = str.substring(i, i + 3);
				if (check.equals("xyz")) {
					if (i > 0 && str.charAt(i - 1) == '.') {
						hasDotXYZ = true;
					} else {
						hasXYZ = true;
					}
				}
			}
			if (hasXYZ && hasDotXYZ) {
				return true;
			} else if (hasXYZ && !hasDotXYZ){
				return true;
			} else {
				return false;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
