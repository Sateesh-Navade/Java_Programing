import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Employees {
	private String name;
	private int age;
	
	Employees(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
}
 class NameComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getName().compareTo(e2.getName());
	}
 }
 
 public class comparator{
	 public static void main(String[] args) {
		ArrayList<Employee> emps=new ArrayList<>();
		emps.add(new Employee("pqr", 88));
		emps.add(new Employee("abc", 55));
		emps.add(new Employee("xyz", 66));
		
		Collections.sort(emps,new NameComparator());
		
		
		System.out.println("Employee Name\tEmployee Age \n============================");
		for(Employee emp:emps) {
			System.out.println(emp.getName()+"\t      \t"+emp.getAge());
		}
	 }
 }
