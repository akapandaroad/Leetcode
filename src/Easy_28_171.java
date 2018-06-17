import java.util.HashMap;

/**
 * Created by akapandaroad on 2018-06-16.
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 */
public class Easy_28_171 {

    public static void main(String[] args) {

        String s = "AB";
        s = s.toUpperCase();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 1; i <= 26; i++) {
            map.put((char) (64 + i), i);
        }

        System.out.println(map);
    }

    public int titleToNumber(String s) {
        int result = 0;
        for(int i = 0 ; i < s.length(); i++) {
            result = result * 26 + (s.charAt(i) - 'A' + 1);
        }
        return result;
    }
}
