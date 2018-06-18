import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by akapandaroad on 2018-06-17.
 * Input: The root of a Binary Search Tree like this:
 * 5
 * /   \
 * 2     13
 * <p>
 * Output: The root of a Greater Tree like this:
 * 18
 * /   \
 * 20     13
 */
public class Easy_29_538 {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        Stack<TreeNode> stack = new Stack<>();

        /**
         * 非递归中序遍历
         */
        TreeNode cur = root;
        while (!stack.isEmpty() || cur != null) {


            while(cur!=null){
                System.out.println(cur.val);
                stack.add(cur);
                cur=cur.left;
            }
            cur=stack.pop();
            //System.out.println(cur.val);
            cur=cur.right;





        }


    }
}