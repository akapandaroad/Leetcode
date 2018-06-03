import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by akapandaroad on 2018-06-01.
 * <p>
 * <p>
 * Given a string S and a character C, return an array of integers
 * representing the shortest distance from the character C in the string.
 * <p>
 * Example 1:
 * <p>
 * Input: S = "loveleetcode", C = 'e'
 * Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
 */
public class Easy_9_821 {

    public static void main(String[] args) {
        String S = "loveleetcode";
        char C = 'e';

        //solution1(S,C);
        solution2(S, C);
    }

    private static void solution2(String S, char C) {

        int[] result = new int[S.length()];

        int cPos = Integer.MIN_VALUE / 2;
        for (int i = 0; i < S.length(); i++) {//from left to right
            if (S.charAt(i) == C) {
                cPos = i;
            }
            result[i] = i - cPos;

        }

        cPos = Integer.MAX_VALUE / 2;
        for (int i = S.length() - 1; i >= 0; i--) {
            if (S.charAt(i) == C) {
                cPos = i;
            }
            result[i] = Math.min(result[i], cPos - i);
        }


        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }


    }

    private static void solution1(String S, char C) {
        List<Integer> cPosition = new ArrayList<>();

        int[] result = new int[S.length()];
        char[] sArr = S.toCharArray();

        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i] == C) {
                cPosition.add(i);
            }
        }


        /**
         *
         *!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
         *
         * 比较的所有CPosion值
         */
        for (int i = 0; i < result.length; i++) {
            int minDist = Integer.MAX_VALUE;
            for (int index : cPosition
                    ) {

                minDist = Math.min(minDist, Math.abs(index - i));
            }

            result[i] = minDist;
        }

        for (int i = 0; i < result.length; i++) {

            System.out.println(result[i]);
        }
    }
}
