import java.util.HashMap;

/**
 * Created by akapandaroad on 2018-06-20.
 */
public class Easy_41_409 {

    public static void main(String[] args) {

        String s = "abccccdd";
        longestPalindrome(s);

    }

    public static void longestPalindrome(String s) {

        int counter = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(String.valueOf(s.charAt(i)))) {
                map.put(String.valueOf(s.charAt(i)), 1);
            } else {
                map.remove(String.valueOf(s.charAt(i)));
                counter++;
            }

        }

        System.out.println(map);
        if(!map.isEmpty()) {
            System.out.println(counter*2+1);
        }else{
            System.out.println(counter*2);
        }


    }
}
