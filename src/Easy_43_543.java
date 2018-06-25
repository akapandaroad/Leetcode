/**
 * Created by akapandaroad on 2018-06-21.
 */
public class Easy_43_543 {

    static int max = 0;

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int depth = deep(root);
        System.out.println("Depth is " + depth);
        int countNode = count(root);
        System.out.println("Node number is " + countNode);
        int maxPath = mPath(root);
        System.out.println("The length of max path is " + max);


    }

    private static int mPath(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = mPath(node.left);
        int right = mPath(node.right);


        max = Math.max(max, left + right);

        return Math.max(right, left) + 1;


    }

    private static int count(TreeNode node) {
        if (node == null) {
            return 0;
        }

        return count(node.left) + count(node.right) + 1;

    }

    private static int deep(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = deep(node.left);
        int right = deep(node.right);

        return (left > right) ? (left + 1) : (right + 1);


    }
}
