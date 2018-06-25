import java.util.Arrays;

/**
 * Created by akapandaroad on 2018-06-21.
 */
public class Easy_44_628 {

    static int  max=Integer.MIN_VALUE;
    public static void main(String[] args) {

        int[] nums={-1,-2,-3,10};
        int result=maximumProduct(nums);
        System.out.println(result);

        int result2=maximumProduct2(nums);
        System.out.println(result2);

    }

    private static int maximumProduct2(int[] nums) {

        Arrays.sort(nums);
        return Math.max(nums[0]*nums[1]*nums[nums.length-1]
                ,nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]);

    }



    public static int maximumProduct(int[] nums) {

        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                for (int k = j+1; k <nums.length ; k++) {

                    max=Math.max(max,nums[i]*nums[j]*nums[k]);
                }
            }
        }

        return max;
    }
}
