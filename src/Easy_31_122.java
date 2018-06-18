/**
 * Created by akapandaroad on 2018-06-18.
 * Input: [7,1,5,3,6,4]
 * Output: 7
 * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
 * Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
 */
public class Easy_31_122 {

    public static void main(String[] args) {

        int max = Integer.MIN_VALUE;
        int[] prices = {7, 1, 5, 3, 6, 4};

        for (int nums1 : prices) {

            for (int nums2 : prices) {

                max=Math.max(max,Math.abs(nums1-nums2));

            }

        }
        System.out.println(max);
    }
}
