package compairable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
	int id;
	String name;
	int salary;
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee e) {
		return this.salary - e.salary;
	}
}

public class Sort  {
	public static void main(String[] args) {
		ArrayList<Employee> e1=new ArrayList<>();
		e1.add(new Employee(1, "abc", 10000));
		e1.add(new Employee(2, "abc", 50000));
		e1.add(new Employee(3, "abc", 30000));
		
		Collections.sort(e1);
		
		for(Employee e:e1) {
			System.out.println(e.salary);
		}
	}
}
