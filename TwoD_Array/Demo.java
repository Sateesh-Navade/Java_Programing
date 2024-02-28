package TwoD_Array;

public class Demo {
	public static void main(String[] args) {
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		// Useing For Loop
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		
		// Useing ForEach Loop
//		
//		for (int[] ele : arr1) {
//			for (int ele1 : ele) {
//				System.out.print(ele1+" ");
//			}
//			System.out.println();
//		}
	}
}
