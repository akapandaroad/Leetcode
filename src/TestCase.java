/**
 * Created by akapandaroad on 2018-06-14.
 */
public class TestCase {

    public static void main(String[] args) {

        int a=123123;
        int b=900;

        StringBuilder sb=new StringBuilder(String.valueOf(a));

        System.out.println(Integer.parseInt(sb.reverse().toString()));

        String str=String.valueOf(a);
        char[] strArr=str.toCharArray();


        int start=0;
        int end=strArr.length-1;
        char temp;
        for (int i = 0; i <strArr.length/2 ; i++) {
            temp=strArr[start];
            strArr[start]=strArr[end];
            strArr[end]=temp;
            start++;
            end--;
        }

        System.out.println(String.valueOf(strArr));



    }
}
