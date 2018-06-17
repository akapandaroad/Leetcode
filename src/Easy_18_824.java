import java.util.ArrayList;
import java.util.List;

/**
 * Created by akapandaroad on 2018-06-09.
 */
public class Easy_18_824 {

    public static void main(String[] args) {
        String S = "I speak Goat Latin";
        StringBuilder sb = new StringBuilder();
        //char[] vowelsArr={'a','e','i','o','u'};
        ArrayList<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');


        System.out.println(vowels);
        String[] arrS = S.split(" ");
        for (int i = 0; i < arrS.length; i++) {

            if (vowels.contains(arrS[i].toLowerCase().charAt(0))) {
                sb.append(arrS[i]);
                sb.append("ma");
            } else {

                sb.append(arrS[i].substring(1,arrS[i].length())+arrS[i].charAt(0)+"ma");

            }

            for (int j = 0; j < i + 1; j++) {

                sb.append('a');
            }

            sb.append(" ");
        }

    }
}
