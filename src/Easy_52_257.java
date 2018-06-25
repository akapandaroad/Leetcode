import apple.laf.JRSUIUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by akapandaroad on 2018-06-22.
 * <p>
 * Given a binary tree, return all root-to-leaf paths.
 * <p>
 * Note: A leaf is a node with no children.
 * <p>
 * Example:
 * <p>
 * Input:
 * <p>
 * 1
 * /   \
 * 2     3
 * \
 * 5
 * <p>
 * Output: ["1->2->5", "1->3"]
 * <p>
 * Explanation: All root-to-leaf paths are: 1->2->5, 1->3
 */
public class Easy_52_257 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        binaryTreePaths(root);


    }

    public static void binaryTreePaths(TreeNode root) {

        List<String> list = new ArrayList<>();
        Queue<TreeNode> qNode = new LinkedList<TreeNode>();
        Queue<String> qStr = new LinkedList<String>();

        qNode.add(root);
        qStr.add("");
        while (!qNode.isEmpty()) {
            int size = qNode.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur=qNode.poll();
                String curStr=qStr.poll();
                System.out.println(curStr);
                if (cur.left==null && cur.right==null) list.add(curStr+cur.val);
                if(cur.left!=null){
                    qNode.add(cur.left);
                    qStr.add(curStr+cur.val+"->");
                }
                if(cur.right!=null){
                    qNode.add(cur.right);
                    qStr.add(curStr+cur.val+"->");
                }
            }
        }

        System.out.println(list);


    }


}
