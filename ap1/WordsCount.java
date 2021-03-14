package ap1;

public class WordsCount {

	public static int wordsCount(String[] words, int len) {
		int counter = 0;
		
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() == len) {
				counter++;
			}
		}
		return counter;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
