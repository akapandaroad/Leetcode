import java.util.HashMap;

/**
 * Created by akapandaroad on 2018-06-20.
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 * <p>
 * Examples:
 * <p>
 * s = "leetcode"
 * return 0.
 * <p>
 * s = "loveleetcode",
 * return 2.
 * Note: You may assume the string contain only lowercase letters.
 */
public class Easy_38_387 {

    public static int firstUniqChar(String s) {

        int result=0;
        char[] sArr=s.toCharArray();
        int[] table=new int[26];

        for (Character c:
             sArr) {
           table[c-'a']++;
        }


            for (int j = 0; j <sArr.length ; j++) {
                if (table[sArr[j]-'a']==1){
                    result=j;
                    break;
                }
            }


        System.out.println(result);

            return result;
    }

    public static void main(String[] args) {

        String s = "leetcode";
        //String s = "loveleetcode";

        //System.out.println(s.equals(""));
        firstUniqChar(s);
    }
}
