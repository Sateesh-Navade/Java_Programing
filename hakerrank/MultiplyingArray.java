package hakerrank;
public class MultiplyingArray {
    public static int[] mulele(int[]a1,int n)
    {
        int [] newarr=new int[a1.length];
        for(int i=0;i<a1.length;i++)
        {
            newarr[i]=a1[i]*n;
            System.out.println(newarr[i]);
        }
        
        return newarr;
    }
    
    public static void main(String[] args) {
       int []a1={2,3,1,5,6,5};
      int[] res= mulele(a1,2);
      for (int i : res)
      {
        System.out.print(i +" ");
      }
    }
}
