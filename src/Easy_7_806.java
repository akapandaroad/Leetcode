/**
 * Created by akapandaroad on 2018-05-31.
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
