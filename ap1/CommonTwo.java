package ap1;

public class CommonTwo {

	public static int commonTwo(String[] a, String[] b) {
		int bIndex = 0;
		int counter = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (i > 0 && a[i].equals(a[i - 1])) {
				continue;
			} 
			boolean saw = false;
			
			while (bIndex < b.length && b[bIndex].compareTo(a[i]) <= 0) {
				if (!saw && b[bIndex].equals(a[i])) {
					counter++;
					saw = true;
				}
				bIndex++;
			}
		}
		return counter;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
