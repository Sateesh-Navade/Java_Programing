package hakerrank;

import java.util.Scanner;
//i/p=wefh2hfe2  o/p=4
public class SumOfDigits {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		int sum=0;
		for (int i = 0; i < ch.length; i++)
		{
			if(ch[i]>='1'&&ch[i]<='9')
			{
				sum=sum+ch[i]-48;
			}
		}
		System.out.println("Sum is : "+sum);
	}
}