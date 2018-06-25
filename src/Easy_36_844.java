import java.util.Stack;

/**
 * Created by akapandaroad on 2018-06-20.
 */
public class Easy_36_844 {
    public static boolean backspaceCompare(String S, String T) {

        char[] sArr = S.toCharArray();
        Stack<String> s1 = new Stack<>();
        char[] tArr = T.toCharArray();
        Stack<String> s2 = new Stack<>();
        for (int i = 0; i < sArr.length; i++) {
                if (sArr[i] == '#') {
                    if(s1.size()>0){
                        s1.pop();
                    }

                } else {
                    s1.push(String.valueOf(sArr[i]));
                }


        }

        for (int i = 0; i < tArr.length; i++) {


                if (tArr[i] == '#') {
                    if(s2.size()>0){
                        s2.pop();
                    }
                } else {
                    s2.push(String.valueOf(tArr[i]));
                }
            }



        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s2));
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        String S = "a##c";
        String T = "#a#c";
        backspaceCompare(S,T);

    }
}