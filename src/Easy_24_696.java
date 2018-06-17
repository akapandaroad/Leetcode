/**
 * Created by akapandaroad on 2018-06-16.
 * <p>
 * Count Binary Substrings
 * <p>
 * Input: "00110011"
 * Output: 6
 * Explanation: There are 6 substrings that have equal number of consecutive 1's and 0's:
 * "0011", "01", "1100", "10", "0011", and "01".
 * <p>
 * Notice that some of these substrings repeat and are counted the number of times they occur.
 * <p>
 * Also, "00110011" is not a valid substring because all the 0's (and 1's) are not grouped together.
 * Example 2:
 */
public class Easy_24_696 {

    public static void main(String[] args) {

        String s = "10101";

        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {

                if (isconsecutive(s.substring(i,j))) {
                    System.out.println(s.substring(i, j));

                    counter++;
                }

            }


        }

        System.out.println(counter);


    }

    private static boolean isconsecutive(String substring) {


        if (substring.length() == 1) {
            return false;
        }
        if (substring.length() % 2 != 0) {
            return false;
        }

        int start = 0;
        int end = substring.length() - 1;
        while (start < end) {
            if (substring.charAt(start) == substring.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
