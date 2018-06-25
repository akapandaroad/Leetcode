/**
 * Created by akapandaroad on 2018-06-24.
 * <p>
 * Given an integer, write a function to determine if it is a power of two.
 * <p>
 * Example 1:
 * <p>
 * Input: 1
 * Output: true
 * Explanation: 20 = 1
 * Example 2:
 * <p>
 * Input: 16
 * Output: true
 * Explanation: 24 = 16
 * Example 3:
 * <p>
 * Input: 218
 * Output: false
 */
public class Easy_59_231 {

    public static void main(String[] args) {
        int n = 162;
        boolean result=isPowerOfTwo(n);
        boolean result2=isPowerOfTwo2(n);
        boolean result3=isPowerOfTwo3(n);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }

    private static boolean isPowerOfTwo3(int n) {// bit compution
        return (n&(n-1))==0;
    }

    private static boolean isPowerOfTwo2(int n) {//

        boolean flag=false;
        while(n%2==0){
            n=n/2;
            //System.out.println(n);
        }
        return n==1;
    }

    public static boolean isPowerOfTwo(int n) {

        int result = 0;
        boolean flag = false;
        int index = 0;
        while (result < n && flag==false) {
            if (n == Math.pow(2, index)) {
                flag = true;
            } else {
                result = (int)Math.pow(2, index);
                index++;

            }
        }
            return flag;
    }

}
