import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by akapandaroad on 2018-05-31.
 * Input: [1,4,3,2]
 * <p>
 * Output: 4
 * Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
 */
public class Easy_6_561 {

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};

        Arrays.sort(nums);

        int result=0;
        for (int i = 0; i <nums.length ; i+=2) {

            result+=nums[i];

        }


        System.out.println(result);
    }
}
