package ABC;

//find the duplicate number on a given integer array?
//1-->2
//2-->2
//3-->1
public class P101 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 2, 1 };           //[f,f,f,t,t]
		boolean[] r = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (r[i] == false) {
				int c = 1;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						c++;
						r[j] = true;
					}
				}
				System.out.println(arr[i]+"-->"+c);
			}
		}
	}
}
