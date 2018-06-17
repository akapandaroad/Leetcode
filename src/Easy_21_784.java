import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by akapandaroad on 2018-06-14.
 * Given a string S, we can transform every letter individually to be lowercase or uppercase to create another string.  Return a list of all possible strings we could create.
 * <p>
 * Examples:
 * Input: S = "a1b2"
 * Output: ["a1b2", "a1B2", "A1b2", "A1B2"]
 * <p>
 * Input: S = "3z4"
 * Output: ["3z4", "3Z4"]
 * <p>
 * Input: S = "12345"
 * Output: ["12345"]
 */
public class Easy_21_784 {
    public static void main(String[] args) {

        String S = "a1b2";
        Queue<String> queue = new LinkedList<>();
        queue.add(S);
        int index = 0;

        while (!S.isEmpty() && index < S.length()) {
            if (Character.isDigit(S.charAt(index))) {
                index++;
            } else {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    String cur = queue.poll();


                    String sub = cur.substring(index + 1, S.length());
                    //System.out.println(sub);
                    String first = cur.substring(index, index + 1).toLowerCase();
                    //System.out.println(first);
                    String left = cur.substring(0, index) + first + sub;

                    queue.add(left);
/**
 * better solution
 * String cur = queue.poll();
 char[] chs = cur.toCharArray();

 chs[i] = Character.toUpperCase(chs[i]);
 queue.offer(String.valueOf(chs));

 chs[i] = Character.toLowerCase(chs[i]);
 queue.offer(String.valueOf(chs));
 */

                    String sub2 = cur.substring(index + 1, S.length());
                    String first2 = cur.substring(index, index + 1).toUpperCase();
                    String right = cur.substring(0, index) + first2 + sub2;
                    //System.out.println(right+"  right");
                    queue.add(right);

                }
                index++;
            }


        }

        List<String> list = new ArrayList<>(queue);
        System.out.println(list);


    }
}
