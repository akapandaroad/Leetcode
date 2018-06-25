import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by akapandaroad on 2018-06-21.
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
 * <p>
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * return its bottom-up level order traversal as:
 * [
 * [15,7],
 * [9,20],
 * [3]
 * ]
 */
public class Easy_49_107 {

    public static void main(String[] args) {

        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.left.left=new TreeNode(15);
        root.right.right=new TreeNode(7);

        levelOrderBottom(root);

    }


    public static void levelOrderBottom(TreeNode root) {


        int level=0;
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        queue.add(root);
//        list.add(Arrays.asList(3));
        while (!queue.isEmpty()) {
            level++;
            int size = queue.size();
            List<Integer> childList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                childList.add(cur.val);
                if (cur.left != null) {
                    queue.add(cur.left);
                }
                if (cur.right != null) {
                    queue.add(cur.right);
                }
            }
            list.add(0,childList);


        }
        System.out.println(list);

    }
}
