package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LiuHanxu
 * @Classname PreorderTraversal
 * @Description TODO 二叉树前序遍历
 * @Date 2022/9/19 16:47
 */
public class PreorderTraversal {
    public static void main(String[] args) {

    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorderTraversal(root, list);
        return list;
    }

    public void preorderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        list.add(node.val);
        if (node.left != null) {
            preorderTraversal(node.left, list);
        }
        if (node.right != null) {
            preorderTraversal(node.right, list);
        }
    }
}
