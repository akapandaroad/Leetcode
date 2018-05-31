import java.util.HashSet;

/**
 * Created by akapandaroad on 2018-05-29.
 */
public class Easy_2_804 {
    public static void main(String[] args) {


        String[] words = {"gin", "zen", "gig", "msg"};

        HashSet<String> hashSet = new HashSet<>();
        String[] result = new String[words.length];

        String[] moreseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
                "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        for (int i = 0; i < words.length; i++) {

            //char[] letters = words[i].toCharArray();
            for (int j = 0; j < words[i].length(); j++) {
                result[i] += moreseCode[words[i].charAt(j) - 'a'];
                // counter +=moreseCode[words[i].charAt(j)-'a'];
            }

            hashSet.add(result[i]);
        }


        System.out.println(hashSet.size());
    }


}
