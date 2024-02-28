import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employ {
	private String name;
	private Integer age;
	
	Employ(String name,Integer age ){
		this.age=age;
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}

class nameCompare implements Comparator<Employ>{
	public int compare(Employ e1,Employ e2) {
		return -e1.getName().compareTo(e2.getName());
	}
}
class SalCompare implements Comparator<Employ>{
	public int compare(Employ e1, Employ e2) {
		return e1.getAge().compareTo(e2.getAge());
	}
}

//make Sure Every Datatype must be Wrapper Class
public class UseComparatorAndArrayListAlwaysToSort {
	public static void main(String[] args) {
		ArrayList<Employ> a=new ArrayList<>();
		a.add(new Employ("abc", 25));
		a.add(new Employ("bca", 21));
		a.add(new Employ("cba", 29));
		
		Collections.sort(a,new nameCompare());
		Collections.sort(a,new SalCompare());
		
		for(Employ ele:a) {
			System.out.println(ele.getName()+"  "+ele.getAge());
		}
		
	}
}
