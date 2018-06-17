import java.util.Arrays;

/**
 * Created by akapandaroad on 2018-06-14.
 */
public class Easy_20_485 {

    public static void main(String[] args) {
        int sum = 0;

        int[] nums = {1, 1, 0, 1, 1, 1};
        int[] max = new int[nums.length+1];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                max[index++] = sum;
                sum = 0;
            }else
            {
                sum++;
            }


        }
        max[index++] = sum;

        System.out.println(sum);

        Arrays.sort(max);

        System.out.println(max[max.length-1]);

    }
}
