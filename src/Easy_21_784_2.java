import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by akapandaroad on 2018-06-15.
 */
public class Easy_21_784_2 {

    public static void main(String[] args) {
        String S = "a1b2";
        List<String> res = new LinkedList<>();
        helper(S, res, 0);
        Set<String> set = new HashSet<>(res);
        System.out.println(set);

    }

    private static void helper(String s, List<String> res, int pos) {

        if (pos == s.length()) {
            res.add(s);
            return;
        }
        char[] chars = s.toCharArray();

        if (Character.isDigit(chars[pos])) {
            helper(s, res, pos + 1);
        }
        chars[pos] = Character.toLowerCase(chars[pos]);
        helper(String.valueOf(chars), res, pos + 1);

        chars[pos] = Character.toUpperCase(chars[pos]);
        helper(String.valueOf(chars), res, pos + 1);
    }
}
