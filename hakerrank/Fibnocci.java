package hakerrank;
//recheck
public class Fibnocci {
	public static void main(String[] args) {
		int n=4;//0,1,1,2,3,5,8
		System.out.println(isfib(n)?"fib":"Not fib");
	}

	private static boolean isfib(int n) {
		int n1=0,n2=1,n3=0;
		while (n1<=0) {
			if (n1==0) {
				return true;
			}
			n3= n1+n2;
			n1=n2;
		}
		return false;
	}
}
