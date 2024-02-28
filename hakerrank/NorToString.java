package hakerrank;

public class NorToString {
	public static void main(String[] args) {
		int n=123;
		String arr[]= {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
		String ans="";
		while (n!=0) {
			ans=arr[n%10]+ans;
			n=n/10;
		}
		System.out.println(ans);
	}
}
