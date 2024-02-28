package TwoD_Array;

import java.util.Scanner;

public class SumOfDiagonal {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Size of Row And Col");
		int row = s.nextInt();
		int col = s.nextInt();
		int lsum=0;
		int rsum=0;

		int[][] arr = new int[row][col];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j]=s.nextInt();
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]);
				
				if(i==j)
				lsum=lsum+arr[i][j];
				
				if(i+j==row-1)
					rsum+=arr[i][j];
				
			}
			System.out.println();
		}
		System.out.println("Sum of Left Diagonal :"+lsum);
		System.out.println("Sum of Right Diagonal :"+rsum);
	}
}
