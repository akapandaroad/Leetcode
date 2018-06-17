import java.util.ArrayList;
import java.util.List;

/**
 * Created by akapandaroad on 2018-06-16.
 */
public class Easy_26_606 {
    public static void main(String[] args) {

        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);

        tree2str(root);

    }


    public static void tree2str(TreeNode root) {

        List<String> list=new ArrayList<>();
        String result=inorder(root);

        System.out.println(result);

    }

    private static String  inorder(TreeNode root) {

        if(root==null){
            return "";
        }

        String result=root.val+"";
        String left=inorder(root.left);
        String right=inorder(root.right);

        if (left == "" && right == "") return result;
        if(left=="") return result+"()"+ "(" + right + ")";
        if(right=="") return  result+"("+left+")";

        return result + "(" + left + ")" + "(" + right + ")";
    }
}
