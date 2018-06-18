import java.util.Arrays;

/**
 * Created by akapandaroad on 2018-06-18.
 */
public class Easy_30_169 {

    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,2};


        Arrays.sort(nums);
        if(nums.length%2==0){
            System.out.println(nums[nums.length/2]);
        }
        else{
            System.out.println(nums[(nums.length-1)/2]);
        }
    }
}
