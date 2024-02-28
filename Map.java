import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Map {
	public static void main(String[] args) {
		HashMap<Integer, String> m=new HashMap<>();
		m.put(1, "s");
		m.put(2, "a");
		m.put(3, "t");
		m.put(4, "i");
		m.put(5, "s");
		m.put(6, "h");
		m.put(6, "l"); //overrides the value of 6th key
		
		Set<Integer> s=m.keySet();
		System.out.println(s);
		
		m.remove(4);
	
		Iterator<Integer> itr=s.iterator();
		while(itr.hasNext()) {
			Integer key=itr.next();
			String value=m.get(key);
			System.out.println(key +" ==> "+value);
		}
	}
}
