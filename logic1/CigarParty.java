package logic1;

public class CigarParty {

	public static boolean cigarParty(int cigars, boolean isWeekend) {
		if (isWeekend) {
			if (cigars >= 40) {
				return true;
			} else {
				return false;
			}
		} else {
			if (cigars >= 40 && cigars <= 60) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
