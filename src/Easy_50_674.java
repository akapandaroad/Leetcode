import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by akapandaroad on 2018-06-22.
 * Given an unsorted array of integers, find the length of
 * longest continuous increasing subsequence (subarray).

 Example 1:
 Input: [1,3,5,4,7]
 Output: 3
 Explanation: The longest continuous increasing subsequence is [1,3,5], its length is 3.
 Even though [1,3,5,7] is also an increasing subsequence,
 it's not a continuous one where 5 and 7 are separated by 4.
 */
public class Easy_50_674 {
    public static int findLengthOfLCIS(int[] nums) {

        List<Integer> list=new ArrayList<>();
        int counter=0;
        int max=-1;
        int index=1;
        while(index<nums.length){
            if(nums[index]>nums[index-1]){
                counter++;
            }else{
                counter=0;
            }
            index++;

            list.add(counter);
        }


        System.out.println(list);
       int result=list.stream().max(Integer::max).get();
        System.out.println(list.get(result));
        return counter;
    }

    public static void main(String[] args) {
        int[] nums={1,3,5,4,7};
        int result=findLengthOfLCIS(nums);
        //System.out.println(result);
    }
}
