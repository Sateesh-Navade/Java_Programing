
public class DL {
	public static void main(String[] args) {
		String s = " hoW aRe yOu";// o/p= How Are You
		 char[] c=s.toCharArray();
		 
		 for(int i=0;i<c.length;i++) {
			 if(i==0&&c[i]!=' ' || c[i]!=' '&&c[i-1]==' ') {
				 c[i]=(char) (c[i]-32);
			 }
		 }
		 System.out.println(String.valueOf(c));
	}
}
