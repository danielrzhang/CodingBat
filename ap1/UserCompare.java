package ap1;

public class UserCompare {

	public static int userCompare(String aName, int aId, String bName, int bId) {
		if (aName.compareTo(bName) > 0) {
			return 1;
		} else if (aName.compareTo(bName) < 0) {
			return -1;
		} else {
			if (aId > bId) {
				return 1;
			} else if (aId < bId) {
				return -1;
			} else {
				return 0;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
