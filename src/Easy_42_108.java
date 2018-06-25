/**
 * Created by akapandaroad on 2018-06-21.
 */
public class Easy_42_108 {

    public static void main(String[] args) {
        int[] nums={-10,-3,0,5,9};
        sortedArrayToBST(nums);

    }


    public static void sortedArrayToBST(int[] nums) {
        help(nums,0,nums.length-1);



    }

    private static TreeNode help(int[] nums, int low, int high) {

        if(low>high){
            return null;
        }

        int mid=(low+high)/2;
        TreeNode root=new TreeNode(nums[mid]);

        root.left=help(nums,low,mid-1);
        root.right=help(nums,mid+1,high);

        return root;



    }
}
