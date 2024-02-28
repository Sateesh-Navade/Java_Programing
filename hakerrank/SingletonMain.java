package hakerrank;


class Singleton {
	private static Singleton s;
	private Singleton() {
	}
	
	static Singleton createObject() {
		if(s==null)
		s= new Singleton();
		
		return s;
	}
}

public class SingletonMain {
		public static void main(String[] args) {
			System.out.println(Singleton.createObject());
			System.out.println(Singleton.createObject());
			System.out.println(Singleton.createObject());
			System.out.println(Singleton.createObject());
			System.out.println(Singleton.createObject());
			System.out.println(Singleton.createObject());
		
		}
}
