import java.util.HashMap;

/**
 * Created by akapandaroad on 2018-06-23.
 * We define a harmonious array is an array where the difference between
 * its maximum value and its minimum value is exactly 1.
 * <p>
 * Now, given an integer array, you need to find the length of its longest harmonious subsequence
 * among all its possible subsequences.
 * <p>
 * Example 1:
 * Input: [1,3,2,2,5,2,3,7]
 * Output: 5
 * Explanation: The longest harmonious subsequence is [3,2,2,2,3].
 * Note: The length of the input array will not exceed 20,000.
 */
public class Easy_56_594 {
    public static void main(String[] args) {

        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        //int result=findLHS(nums);
        int result2=findLHS2(nums);

        //System.out.println(result);
        System.out.println(result2);

    }

    private static int findLHS2(int[] nums) {
        int res=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for (int key:
             map.keySet()) {
            if(map.containsKey(key+1)){
                res=Math.max(res,map.get(key)+map.get(key+1));
            }
        }

        return res;
    }

    public static int findLHS(int[] nums) {


        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            int counter = 0;
            boolean flag = false;
            for (int j = 0; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    counter++;
                }
                if (nums[j] + 1 == nums[i]) {
                    counter++;
                    flag = true;//{1,1,1,1}
                    //its maximum value and its minimum value is exactly 1.
                }
            }
            if(flag){
                res=Math.max(res,counter);
            }

        }
        return res;
    }
}
