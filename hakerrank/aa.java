package hakerrank;

public class aa {
	public static void main(String[] args) {
		String s="@dsjd#@AB23#&";
		System.out.println((char)65);
		
		int c[]=new int[128];
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			c[ch]++;
		}
		
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>0)
			{
			if((char)i>='a'&&(char)i<='z'||(char)i>='A'&&(char)i<='Z'||(char)i>='0'&&(char)i<='9')
				continue;
			System.out.println((char)i+" --- "+c[i]);
			}
		}
	System.out.println((char)128);
	}
}
