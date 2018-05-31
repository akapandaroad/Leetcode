/**
 * Created by akapandaroad on 2018-05-31.
 * Example :
 Input:
 widths = [4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10]
 S = "bbbcccdddaaa"
 Output: [2, 4]
 Explanation:
 All letters except 'a' have the same length of 10, and
 "bbbcccdddaa" will cover 9 * 10 + 2 * 4 = 98 units.
 For the last 'a', it is written on the second line because
 there is only 2 units left in the first line.
 So the answer is 2 lines, plus 4 units in the second line.
 */
public class Easy_7_806 {


    public static void main(String[] args) {
        int[] widths = {4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        String S = "bbbcccdddaaa";

        int[] result = new int[2];
        int temp[] = new int[100];
        int index = 1;
        for (int i = 0; i < S.length(); i++) {

            temp[index] += widths[S.charAt(i) - 'a'];

            if (temp[index] > 100) {

                temp[index] -= widths[S.charAt(i) - 'a'];
                index++;
                temp[index] += widths[S.charAt(i) - 'a'];
            }
        }
        result[0] = index;
        result[1] = temp[index];


    }
}
