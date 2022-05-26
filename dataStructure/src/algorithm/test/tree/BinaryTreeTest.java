package algorithm.test.tree;

import algorithm.tree.BinaryTree;

/**
 * @author LiuHanxu
 * @Classname BinaryTreeTest
 * @Description TODO 二叉树测试
 * @Date 2022/5/17 16:24
 */
public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree<Integer, Integer> tree = new BinaryTree<>();
        tree.put(2,2);
        tree.put(1,1);
        tree.put(4,4);
        tree.put(14,14);
        tree.put(3,3);
        tree.put(5,5);
        int size = tree.size();
        Integer integer = tree.get(4);
        tree.delete(4);
        size = tree.size();
    }
}
