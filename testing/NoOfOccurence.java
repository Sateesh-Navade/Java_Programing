package testing;

import java.util.Map.Entry;
import java.util.HashMap;

//hi->2
public class NoOfOccurence {
	public static void main(String[] args) {
		String s = "hello hi bye hi";
		String[] r = s.split(" ");
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();


		for (int i = 0; i < r.length; i++) {
			
			Integer n = map.get(r[i]);      // n=null
			if (n == null) {                //true
				map.put(r[i], 1);           //put(hello  1)
			} else {                        
				map.put(r[i], n + 1);         
			}                                
		}

//		System.out.println(map.entrySet()+" "+map.keySet()+" "+map.values());
		
		for (Entry<String, Integer> entry : map.entrySet()) {       //Entry is a class just like a String class 
			String key = entry.getKey();
			int val = entry.getValue();

			System.out.println(key + " --> " + val);
		}
	}
}
