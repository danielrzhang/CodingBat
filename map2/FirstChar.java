package map2;

import java.util.HashMap;
import java.util.Map;

public class FirstChar {

	public static Map<String, String> firstChar(String[] strings) {
		Map<String, String> map = new HashMap<String, String>();
		
		for (int i = 0; i < strings.length; i++) {
			if (map.containsKey(Character.toString(strings[i].charAt(0)))) {
				map.put(Character.toString(strings[i].charAt(0)), map.get(Character.toString(strings[i].charAt(0))) + strings[i]);
			} else {
				map.put(Character.toString(strings[i].charAt(0)), strings[i]);
			}
		}
		return map;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
