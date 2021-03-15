package map1;

import java.util.Map;

public class Topping3 {

	public static Map<String, String> topping3(Map<String, String> map) {
		if (map.containsKey("potato")) {
			map.put("fries", map.get("potato"));
		}
		
		if (map.containsKey("salad")) {
			map.put("spinach", map.get("salad"));
		}
		return map;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
