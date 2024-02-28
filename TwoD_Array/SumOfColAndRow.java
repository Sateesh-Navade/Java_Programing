package TwoD_Array;

import java.util.Scanner;

public class SumOfColAndRow {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Row And Col Size");
		int row = s.nextInt();
		int col = s.nextInt();
		int rsum=0;
		
		int [][]arr=new int[row][col];
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr.length;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]);
				rsum+=arr[i][j];
			}
			System.out.println();
		}
		System.out.println(rsum);
	}
}
