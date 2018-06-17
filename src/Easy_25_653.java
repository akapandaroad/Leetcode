import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by akapandaroad on 2018-06-16.
 * 5
 * / \
 * 3   6
 * / \   \
 * 2   4   7
 * Target = 9
 * <p>
 * Output: True
 */
public class Easy_25_653 {

    public static boolean findTarget(TreeNode root, int k) {

        int index = k;
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            for (int i = 0; i < queue.size(); i++) {
                TreeNode cur = queue.poll();
                list.add(cur.val);
                if (cur.left != null) queue.add(cur.left);
                if (cur.right != null) queue.add(cur.right);
            }

        }
        for (int i = 0; i < list.size(); i++) {
            if (list.contains(k - list.indexOf(i))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);


        System.out.println(findTarget(root, 9));

        findTarget(root, 9);
    }
}
