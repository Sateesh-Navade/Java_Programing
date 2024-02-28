package TwoD_Array;

import java.util.Scanner;

public class TakingInputsOf2D {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int row=s.nextInt();      //size of row
		int col=s.nextInt();      //size of col
		int [][]arr=new int[row][col];
		
		//Input Taking Loop
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j]=s.nextInt();
			}
		}
		
		//Printing Loop
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
