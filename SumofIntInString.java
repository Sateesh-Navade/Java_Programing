
 
public class SumofIntInString {
 
    static int findSum(String str)    //"ab12xy24"
    {
        String temp = "0";
 
        int sum = 0;
 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
 
            if (Character.isDigit(ch)) {
                temp = temp + ch;        //"0"+1=01  //"01"+2=012  //02 //024
//            System.out.println(temp);
            }
            else {
                sum =sum+ Integer.parseInt(temp); //0+0=0 //0+12=12 //12+24=36
                temp = "0";
//            System.out.println(temp);
            }
        }
        return sum + Integer.parseInt(temp);
    }
 
    public static void main(String[] args)
    {
         String str = "ab12xy24";
         System.out.println(findSum(str));
    }
}