
public class frq {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 2, 1 };
		boolean[] r = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (r[i] == false) {
			int c = 1;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						c++;
						r[j]=true;
					}
				}
				System.out.println(arr[i] + "-->" + c);
			}

		}
	}
}
