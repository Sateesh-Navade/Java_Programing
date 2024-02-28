package compairator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

class Employee {
	String name;
	double salary;
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}

class SortSal implements Comparator<Employee>{
	public int compare(Employee e1,Employee e2) {
		return e1.getName().compareTo(e2.getName());
	}
}

public class CustomisedSort {
	public static void main(String[] args) {
		ArrayList<Employee> emps=new ArrayList<>();
		emps.add(new Employee("pqr", 88));
		emps.add(new Employee("abc", 55));
		emps.add(new Employee("xyz", 66));
		
		Collections.sort(emps,new SortSal());
		for(Employee ele:t) {
			System.out.println(ele.getName());
		}
	}
}
