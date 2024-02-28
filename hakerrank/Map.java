package hakerrank;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Map {
	public static void main(String[] args) {
		HashMap h1=new HashMap();
		h1.put(1, 's');
		h1.put(2, 'h');
		h1.put(3, 'i');
		h1.put(4, 'v');
		h1.put(5, 'u');
		System.out.println(h1);

		//		Set keySet = h1.keySet();
		//		Iterator iterator = keySet.iterator();
		//		while (iterator.hasNext()) {
		//			Object key = iterator.next();
		//			System.out.println(h1.get(key));
		//		}	

		Set entrySet = h1.entrySet();
		Iterator ei = entrySet.iterator();
		while (ei.hasNext()) {
			Object key_value = ei.next();
			System.out.println(key_value);

		}
		Collection values = h1.values();
		Iterator v = values.iterator();
		while (v.hasNext()) {
			Object value = v.next();
			System.out.println(value);
		}	}
}
