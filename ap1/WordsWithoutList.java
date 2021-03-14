package ap1;

import java.util.ArrayList;

public class WordsWithoutList {

	public static ArrayList<String> wordsWithoutList(String[] words, int len) {
		ArrayList<String> list = new ArrayList<String>();
		
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() != len) {
				list.add(words[i]);
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
