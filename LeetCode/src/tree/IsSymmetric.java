package tree;

/**
 * @author LiuHanxu
 * @Classname IsSymmetric
 * @Description TODO
 * @Date 2022/9/20 10:57
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个二叉树的根节点 root ， 检查它是否轴对称。
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：root = [1,2,2,3,4,4,3]
 * 输出：true
 * 示例 2：
 *
 *
 * 输入：root = [1,2,2,null,3,null,3]
 * 输出：false
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/symmetric-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class IsSymmetric {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(2, node1, node2);
        TreeNode node6 = new TreeNode(2, node3, node4);
        TreeNode node7 = new TreeNode(1, node5, node6);
        IsSymmetric isSymmetric = new IsSymmetric();
        isSymmetric.isSymmetric(node7);
        //System.out.println(leftList.equals(rightList));
    }
    public boolean isSymmetric(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }
        if (root.left == null || root.right == null) {
            return false;
        }
        if (root.left.val != root.right.val) {
            return false;
        }
        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();
        leftOrder(root, leftList);
        rightOrder(root, rightList);
        return leftList.equals(rightList);
    }

    public void leftOrder(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        if (node.left != null) {
            leftOrder(node.left, list);
        } else {
            list.add(1000);
        }
        if (node.right != null) {
            leftOrder(node.right, list);
        } else {
            list.add(1000);
        }
        list.add(node.val);
    }

    public void rightOrder(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        if (node.right != null) {
            rightOrder(node.right, list);
        } else {
            list.add(1000);
        }
        if (node.left != null) {
            rightOrder(node.left, list);
        } else {
            list.add(1000);
        }
        list.add(node.val);
    }
}
