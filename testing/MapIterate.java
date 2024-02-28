package testing;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapIterate {
	public static void main(String[] args) {
		String s = "aabcc";
		String[] arr = s.split("");

		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			Integer n = map.get(arr[i]); // get() returns a key,if key is not there it returns the null
			if (n == null) {
				map.put(arr[i], 1);
			} else
				map.put(arr[i], n + 1);
		}
//		System.out.println(map.entrySet()); or

		for (Entry<String, Integer> ele : map.entrySet()) {
			String key = ele.getKey();
			Integer val = ele.getValue();
			System.out.println(key + " ==> " + val);
		}
	}
}
