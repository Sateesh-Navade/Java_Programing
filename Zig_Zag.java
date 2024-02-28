import java.util.Arrays;
import java.util.Scanner;

public class Zig_Zag {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of 1st the array ");
		int n=sc.nextInt();
		
		int x[]=new int[n];
		System.out.println("enter the 1st array elemnts ");
		for(int i=0;i<n;i++)
		{
			x[i]=sc.nextInt();
		}
		
		System.out.println("enter the size of 2nd the array ");
		int m=sc.nextInt();
		
		int y[]=new int[m];
		System.out.println("enter the 2nd array elemnts ");
		for(int i=0;i<m;i++)
		{
			y[i]=sc.nextInt();
		}
		
		
		int z[]=zigzag(x,y);
		
		System.out.println(Arrays.toString(z));
		
	}

	public static int[] zigzag(int x[],int y[])
	{
		
		int z[]=new int[x.length+y.length];
		
		int i=0,j=0;
		
		for(int k=0;k<z.length;k++)
		{
			
			
			 if(j<y.length)
				z[k++]=y[j++];
			 if(i<x.length)
				z[k]=x[i++];
		}
		return z;
	}
}
