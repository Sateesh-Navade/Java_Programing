package methodChaining;

class Person{
	String name;
	int age;
	public Person setName(String name) {
		this.name = name;
		return this;
	}
	public Person setAge(int age) {
		this.age = age;
		return this;
	}
	
	public void getDetails() {
		System.out.println(name+"\n"+age);
	}
	
}




public class MethodChainingDemo {
	public static void main(String[] args) {
		Person p= new Person();
		p.setAge(20).setName("ABC");
		p.getDetails();
	}
}
