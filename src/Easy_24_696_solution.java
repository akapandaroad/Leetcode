/**
 * Created by akapandaroad on 2018-06-16.
 */
public class Easy_24_696_solution {

    public int countBinarySubstrings(String s) {

        int[] groups = new int[s.length()];
        int t = 0;
        groups[0] = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) != s.charAt(i)) {
                groups[++t] = 1;
            } else {
                groups[t]++;
            }
        }
        int res = 0;
        for (int i = 1; i <= t; i++) {
            res += Math.min(groups[i], groups[i - 1]);
        }

        return res;

    }
}
