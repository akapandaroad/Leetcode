import java.util.HashMap;

/**
 * Created by akapandaroad on 2018-06-18.
 * Given two strings s and t , write a function to determine if t is an anagram of s.

 Example 1:

 Input: s = "anagram", t = "nagaram"
 Output: true
 Example 2:

 Input: s = "rat", t = "car"
 Output: false
 */
public class Easy_33_242 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
HashMap<String,Integer> map=new HashMap<>();


       int[] table=new int[26];

        for (int i = 0; i <s.length() ; i++) {
            table[s.charAt(i)-'a']++;
            table[t.charAt(i)-'a']--;

        }

        for (int counter:
             table) {

            if(counter!=0){
                System.out.println(false);
            }
        }


        System.out.println(true);


    }
}
