package thred;

public class Main1 {
	public static void main(String[] args) {
		System.err.println("Main Started");
		
		Thread t=new Thread();
		System.out.println("Thread ID :"+t.getId());
		System.out.println("Thread Name :"+t.getName());
		System.out.println("Thread Priority :"+t.getPriority());
		
		System.out.println("Changing Thread Properties");
		
		t.setName("MyThread");
		t.setPriority(9);
		System.out.println("Thread Name :"+t.getName());
		System.out.println("Thread Priority :"+t.getPriority());
		
		System.out.println("Main Ended");

	}
}
