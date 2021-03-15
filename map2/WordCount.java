package map2;

import java.util.HashMap;
import java.util.Map;

public class WordCount {

	public static Map<String, Integer> wordCount(String[] strings) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for (int i = 0; i < strings.length; i++) {
			if (map.containsKey(strings[i])) {
				map.put(strings[i], map.get(strings[i]) + 1);
			} else {
				map.put(strings[i], 1);
			}
		}
		return map;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
