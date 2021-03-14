package ap1;

public class WordsWithout {

	public static String[] wordsWithout(String[] words, String target) {
		int counter = 0;
		
		for (int i = 0; i < words.length; i++) {
			if (!words[i].equals(target)) {
				counter++;
			}
		}
		
		String[] newArray = new String[counter];
		int index = 0;
		
		for (int i = 0; i < words.length; i++) {
			if (!words[i].equals(target)) {
				newArray[index] = words[i];
				index++;
			}
		}
		return newArray;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
