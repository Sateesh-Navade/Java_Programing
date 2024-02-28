package hakerrank;

public class RevWordsInString {
	public static void main(String[] args) {
		String s="Hello hi Bye";
		String arr[] = s.split(" ");
		String arr1="";
		for (int j = 0; j < arr.length; j++) {
			 arr1=arr[j]+" "+arr1;
			
		}
		System.out.println(arr1);
		
	}
}
