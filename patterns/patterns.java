package patterns;

import java.util.Iterator;

public class patterns {
	public static void main(String[] args) {
		int n=5;
//				pattern1(n);
		//		pattern2(n);
		//		pattern3(4);
		//		pattern4(n);
		//		pattern5(n);
		//		pattern6(n);
//		pattern7(n);
//		pattern8(n);
//		pattern9(n);
//		pattern10(n);
		pattern11(n);
	}
	
	
//	*       * 
//	  *   *   
//	    *     
//	  *   *   
//	*       * 
	private static void pattern11(int n) {
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j||i+j==n+1) {
					System.out.print("* ");
				}else
					System.out.print("  ");
			}
			System.out.println();
		}
	}


	private static void pattern10(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||i==n||j==1||j==n&&i>=n/2+1)
				System.out.print("* ");
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}


	private static void pattern9(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(j==1||j==n||i==j&&i<=n/2+1||i+j==n+1&&i<=n/2+1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}


	//	1
	//	12
	//	123
	//	4321
	//	12345
	private static void pattern8(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {          //modify
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
	
	
	
	//	        *
	//	       **
	//	      ***
	//	     ****
	//	    *****
	private static void pattern7(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	//  *
	//	**
	//	***
	//	****
	//  *****
	//	****
	//	***
	//	**
	//	*
	private static void pattern6(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = n-1; i >= 1 ; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	//     *
	//   * * *
	//  * * * *
	// * * * * *
	private static void pattern5(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.print((i+j>=n+1)?"* ":" ");
				//	System.out.print((j>=i)?"* ":" ");            //ulta pyramid
			}
			System.out.println();
		}
	}

	//	12345
	//	1234
	//	123
	//	12
	//	1
	private static void pattern4(int n) {
		for(int i = n; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	//	1
	//	23
	//	456
	//	78910
	private static void pattern3(int n) {
		int c=1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(c);
				c++;
			}
			System.out.println();
		}
	}
	//  *****
	//	****
	//	***
	//	**
	//	*
	private static void pattern2(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println(); 
		}
	}

//	     *
//	    **
//	   ***
//	  ****
//	 *****
	private static void pattern1(int n) {
		for (int i = 1; i <= n ; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
