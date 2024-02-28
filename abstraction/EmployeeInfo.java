package abstraction;

interface EmployeeInfo {
	void printInfo();
}

class Employee implements EmployeeInfo {

	@Override
	public void printInfo() {
		String name="abc";
		int age=22;
		double sal=100000;
		System.out.println("Person Information \n==================\n"+"Name :"+name+"\n"+"Age :"+age+"\n"+"Salary :"+sal);
	}
}


