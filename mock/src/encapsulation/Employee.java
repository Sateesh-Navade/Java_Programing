package encapsulation;

 class EmployeeDetails {
	private int id;
	private String name;

	public EmployeeDetails (int id ,String name) {
		this.id=id;
		this.name=name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
 
 public class Employee{
	 public static void main(String[] args) {
		EmployeeDetails e=new EmployeeDetails(1, "abc");
		System.out.println("Old ID :"+e.getId());
		e.setId(5);
		System.out.println("New ID :"+e.getId());
	}
 }
