import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee> {
	private String name;
	private int age;
	
	Employee(String name,int age){
		this.name=name;
		this.age=age;
	}

	// Used to sort Employees by age
	@Override
	public int compareTo(Employee o) {
		return this.age - o.age;
	}
	public String getName() {return name;}
	public int getAge() {return age;}

}

public class comparable{
	public static void main(String[] args) {
		ArrayList<Employee> emps=new ArrayList<>();
		emps.add(new Employee("abc", 55));
		emps.add(new Employee("pqr", 88));
		emps.add(new Employee("xyz", 66));
		
		Collections.sort(emps);
		
//		for(int i=0;i<emps.size();i++) {
//			System.out.println(emps.get(i));
//		}
		   //or
		System.out.println("Employee Name\tEmployee Age \n============================");
		for(Employee emp:emps) {
			System.out.println(emp.getName()+"\t      \t"+emp.getAge());
		}
	}
}
