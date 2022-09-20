package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author LiuHanxu
 * @Classname LevelOrderBottom
 * @Description TODO
 * @Date 2022/9/20 10:32
 */
public class LevelOrderBottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> reverseList = new ArrayList<>();
        List<List<Integer>> resultList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int length = queue.size();
            List<Integer> list = new ArrayList<>();
            while (length > 0) {
                TreeNode outNode = queue.poll();
                list.add(outNode.val);
                if (outNode.left != null) {
                    queue.offer(outNode.left);
                }
                if (outNode.right != null) {
                    queue.offer(outNode.right);
                }
                length--;
            }
            reverseList.add(list);
        }
        for (int i = reverseList.size() - 1; i >= 0; i--) {
            resultList.add(reverseList.get(i));
        }
        return resultList;
    }
}
