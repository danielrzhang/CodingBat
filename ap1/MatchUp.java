package ap1;

public class MatchUp {

	public static int matchUp(String[] a, String[] b) {
		int counter = 0;
		
		for (int i = 0; i < a.length; i++) {
			if ((!a[i].equals("")) && (!b[i].equals(""))) {
				if (a[i].charAt(0) == b[i].charAt(0)) {
					counter++;
				} 
			}
		}
		return counter;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
