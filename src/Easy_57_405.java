import java.util.HashMap;

/**
 * Created by akapandaroad on 2018-06-23.
 * Given an integer, write an algorithm to convert it to hexadecimal.
 * For negative integer, two’s complement method is used.
 * <p>
 * Note:
 * All letters in hexadecimal (a-f) must be in lowercase.
 * The hexadecimal string must not contain extra leading 0s.
 * If the number is zero, it is represented by a single zero character '0';
 * otherwise, the first character in the hexadecimal string will not be the zero character.
 * The given number is guaranteed to fit within the range of a 32-bit signed integer.
 * You must not use any method provided by the library which converts/formats the number to hex directly.
 * Example 1:
 * <p>
 * Input:
 * 26
 * <p>
 * Output:
 * "1a"
 * Example 2:
 * <p>
 * Input:
 * -1
 * <p>
 * Output:
 * "ffffffff"
 */
public class Easy_57_405 {

    public static void main(String[] args) {

        //toBinary(26);
        toHex(-26);
    }

    public static void toHex(int num) {

        System.out.println(Integer.toHexString(num));

        char[] mapArr = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        int index=0;
        StringBuilder sb=new StringBuilder();
        HashMap<Integer,Character> map=new HashMap<>();
        for (char letters:mapArr) {
            map.put(index++,letters);
        }
        if(num>0){
            int n=num;
            while(n>=1){
                sb.append(map.get(n%16)+"");
                n=n/16;
            }
            System.out.println(sb.reverse());
        }

    }

    public static void toBinary(int num) {
        System.out.println(Integer.toBinaryString(num));
        StringBuilder sb=new StringBuilder();
        int n=num;
        while(n>=1){
            sb.append(n%2+"");
            n=n/2;
        }
        System.out.println(sb.reverse());


    }
}

