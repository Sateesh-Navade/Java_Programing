
public class ArrayLength {
	public static void main(String[] args) {
//		int[] a= {1,2,3};
		String a="ab$c1";
		char []c=a.toCharArray();
		int i=0;
		
//		try {
//			while(true) {
//				if(c[i]>='a'&&c[i]<='z'||c[i]>='0'&&c[i]<='9') {
//					i++;
//				}else
//					i++;
//			}
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(i);
//		}
		
		//OR
		
		char ch=0;
		try {
			while(true) {
				ch=c[i];
				i++;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(i);
		}
	}
	
}
