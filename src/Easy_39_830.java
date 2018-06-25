import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by akapandaroad on 2018-06-20.
 * In a string S of lowercase letters, these letters form consecutive groups of the same character.
 * <p>
 * For example, a string like S = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z" and "yy".
 * <p>
 * Call a group large if it has 3 or more characters.
 * We would like the starting and ending positions of every large group.
 * The final answer should be in lexicographic order.
 * Example 1:
 * Input: "abbxxxxzzy"
 * Output: [[3,6]]
 * Explanation: "xxxx" is the single large group with starting  3 and ending positions 6.
 * Example 2:
 * Input: "abc"
 * Output: []
 * Explanation: We have "a","b" and "c" but no large group.
 * Example 3:
 * Input: "abcdddeeeeaabbbcd"
 * Output: [[3,5],[6,9],[12,14]]
 */
public class Easy_39_830 {
    public static void main(String[] args) {
        String str = "abcdddeeeeaabbbcd";

        largeGroupPositions(str);


    }

    public static void largeGroupPositions(String S) {

        ArrayList<Integer> list = new ArrayList<>();
        int start = 0;
        int end = 1;
        int counter = 1;
        while (end < S.length()) {
            if (S.charAt(start) == S.charAt(end)) {
                while (S.charAt(start) == S.charAt(end)) {
                    end++;
                    counter++;
                }
                if (counter >= 3) {
                    list.addAll(Arrays.asList(start, end - 1));
                    counter = 0;
                }
                start = end;
                end = start + 1;

            } else {
                start++;
                end++;
            }
        }
        System.out.println(list);

    }

}
