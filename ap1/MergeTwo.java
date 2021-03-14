package ap1;

import java.util.Arrays;

public class MergeTwo {

	public static String[] mergeTwo(String[] a, String[] b, int n) {
		String[] newArray = new String[n];
		int aIndex = 0;
		int bIndex = 0;
		
		for (int i = 0; i < n; i++) {
			if (a[aIndex].compareTo(b[bIndex]) < 0) {
				newArray[i] = a[aIndex];
			} else {
				newArray[i] = b[bIndex];
			}
			
			while (aIndex < a.length && newArray[i].equals(a[aIndex])) {
				aIndex++;
			}
			
			while (bIndex < b.length && newArray[i].equals(b[bIndex])) {
				bIndex++;
			}
		}
		return newArray;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Arrays.toString(mergeTwo(new String[] {"f", "g", "z"}, new String[] {"c", "f", "g"}, 3)));
	}

}
