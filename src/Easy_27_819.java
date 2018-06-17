import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by akapandaroad on 2018-06-16.
 * Example:
 * Input:
 * paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
 * banned = ["hit"]
 * Output: "ball"
 * Explanation:
 * "hit" occurs 3 times, but it is a banned word.
 * "ball" occurs twice (and no other word does), so it is
 * the most frequent non-banned word in the paragraph.
 * Note that words in the paragraph are not case sensitive,
 * that punctuation is ignored (even if adjacent to words, such as "ball,"),
 * and that "hit" isn't the answer even though it occurs more because it is banned.
 */
public class Easy_27_819 {
    public static void main(String[] args) {
        int max = 0;
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> set=new HashSet<>();
        paragraph = paragraph.toLowerCase();
        String maxString="";
        String[] words = paragraph.split("[ !?',;.]+");
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }

        for (String bannedWord : banned) {
            if (map.containsKey(bannedWord)) {
                map.remove(bannedWord);
            }
        }

        System.out.println(map);
        for (String str:
             map.keySet()) {
            if(max<map.get(str)){
                max=map.get(str);
                maxString=str;
            }

        }

        System.out.println(max+" "+maxString);



                // Set set= map.entrySet();


    }
}
