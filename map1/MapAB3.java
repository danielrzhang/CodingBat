package map1;

import java.util.Map;

public class MapAB3 {

	public static Map<String, String> mapAB3(Map<String, String> map) {
		if (map.containsKey("a") && !map.containsKey("b")) {
			map.put("b", map.get("a"));
		} else if (!map.containsKey("a") && map.containsKey("b")) {
			map.put("a", map.get("b"));
		}
		return map;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
