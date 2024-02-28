package ABC;
//count all special characters in a given string
public class P37 {
	public static void main(String[] args) {
		String s="abc@123#";//o/p=2
		int count=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='a'&&c<='z'||c>='1'&&c<='9') {
			}else {
				count++;
			System.out.println(c);}
		}
		System.out.println("count of special characters :"+count);
	}
}
