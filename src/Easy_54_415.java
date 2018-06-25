/**
 * Created by akapandaroad on 2018-06-22.
 * Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.
 * Note:
 * The length of both num1 and num2 is < 5100.
 * Both num1 and num2 contains only digits 0-9.
 * Both num1 and num2 does not contain any leading zero.
 * You must not use any built-in BigInteger library or convert the inputs to integer directly.
 * @author akapandaroad
 */
public class Easy_54_415 {

    public static void main(String[] args) {

        String num1 = "123123";
        String num2 = "456";
        String result=addStrings(num1, num2);

        //System.out.println(result);
       // System.out.println('3'-'1');
    }

    public static String addStrings(String num1, String num2) {

        char[] num1Arr=num1.toCharArray();
        char[] num2Arr=num2.toCharArray();
        int carry = 0;
        StringBuffer sb=new StringBuffer();
        for (int i = num1Arr.length-1, j=num2Arr.length-1; i >=0||j>=0||carry==1; i--,j--) {
            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';
            sb.append((x+y+carry)%10);
            carry=(x+y+carry)/10;
        }

        return sb.reverse().toString();

    }
}
