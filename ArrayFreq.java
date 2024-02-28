import java.util.Scanner;

public class ArrayFreq {
	public static void main(String[] args) {
//	
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter the size of the array ");
//	int n=sc.nextInt();
//	
//	int x[]=new int[n];
//	System.out.println("enter the array elemnts ");
//	for(int i=0;i<n;i++)
//	{
//		x[i]=sc.nextInt();
//	}
//	
		int[] x = { 1, 2, 3, 2, 1 };
		Freq(x);
	}

	static void Freq(int x[]) {

		boolean rs[] = new boolean[x.length];// [false,false,false,false,false]

		for (int i = 0; i < x.length; i++) {

			if (rs[i] == false) {
				int c = 1;

				for (int j = i + 1; j < x.length; j++) {
					if (x[i] == x[j]) {
						c++;
						rs[j] = true;
					}
				}
				System.out.println(x[i] + "-->" + c);
			}
		}
	}
}
