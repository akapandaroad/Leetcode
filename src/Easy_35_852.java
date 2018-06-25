/**
 * Created by akapandaroad on 2018-06-19.
 */
public class Easy_35_852 {
    public static void main(String[] args) {

        int[] num = {0, 2, 1, 0};

        int i = 0;
        int j = 1;

        while (num[i] - num[j] < 0) {
            i++;
            j++;
        }
        System.out.println(i);


    }
}
