import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by akapandaroad on 2018-06-21.
 * Given a list of sorted characters letters containing only lowercase letters,
 * and given a target letter target, find the smallest element in the list that is larger than the given target.

 Letters also wrap around. For example, if the target is target = 'z' and letters = ['a', 'b'], the answer is 'a'.
 */
public class Easy_48_744 {

    public static void main(String[] args) {


        char[] letters={'c', 'f', 'j'};
        char target = 'd';
        char result=nextGreatestLetter(letters,target);

        System.out.println(result);

    }


    public static char nextGreatestLetter(char[] letters, char target) {
        boolean[] seen = new boolean[26];
        for (char c: letters)
            seen[c - 'a'] = true;

        while (true) {
            target++;
            if (target > 'z') target = 'a';
            if (seen[target - 'a']) return target;
        }
    }
}
