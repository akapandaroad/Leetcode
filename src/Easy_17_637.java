import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by akapandaroad on 2018-06-06.
 * <p>
 * Input:
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * Output: [3, 14.5, 11]
 * Explanation:
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Easy_17_637 {

    public static void main(String[] args) {

        TreeNode root = BuildTree();

        Bfs(root);

    }



    private static void Bfs(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        double count;
        int layer;
        queue.add(root);
        while (!queue.isEmpty()) {
            count = queue.size();
            double sum = 0;
            for (int i = 0; i < count; i++) {
                TreeNode cur = queue.poll();
                if (cur.left != null) {
                    queue.add(cur.left);
                }
                if (cur.right != null) {
                    queue.add(cur.right);
                }
                sum += cur.val;
            }
            list.add(sum / count);
        }
        System.out.println(list);
    }

    private static TreeNode BuildTree() {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        return root;
    }
}
