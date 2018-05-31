/**
 * Created by akapandaroad on 2018-05-28.
 */
public class Easy_1_771 {
    public static void main(String[] args) {

        String J = "aA";
        String S = "aAAbbbb";
        int counter = 0;

        int result = func1(J, S, counter);
        System.out.println(result);

        int result2 = func2(J, S,counter);
        System.out.println(result2);

    }

    private static int func2(String J, String S,int counter) {
        char[] j = J.toCharArray();
        char[] s = S.toCharArray();
        int [] count= new int[256];
        for (int i = 0; i <j.length ; i++) {
            count[j[i]]++;
        }

        for (int k = 0; k <s.length ; k++) {

            counter+=count[s[k]];
        }


        return counter;

    }

    private static int func1(String J, String S, int counter) {
        char[] j = J.toCharArray();
        char[] s = S.toCharArray();
        for (int i = 0; i < j.length; i++) {
            for (int k = 0; k < s.length; k++) {

                if (j[i] == s[k]) {
                    counter++;
                }
            }
        }

        return counter;
    }
}
