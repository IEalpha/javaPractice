package algorithm.test.tree;

import algorithm.linear.Queue;
import algorithm.tree.BinaryTree;

/**
 * @author LiuHanxu
 * @Classname BinaryTreeErgodicTest
 * @Description TODO 二叉树前中后序遍历测试
 * @Date 2022/5/26 19:10
 */
public class BinaryTreeErgodicTest {
    public static void main(String[] args) {
        BinaryTree<Integer, Integer> tree = new BinaryTree<>();
        tree.put(5, 5);
        tree.put(2, 2);
        tree.put(7, 7);
        tree.put(1, 1);
        tree.put(4, 4);
        tree.put(6, 6);
        tree.put(8, 8);
        tree.put(3, 3);
        Integer max = tree.max();
        Integer min = tree.min();
        Queue<Integer> keys1 = tree.preErgodic();
        for (Integer key : keys1) {
            System.out.println(tree.get(key));
        }
        System.out.println("========================================");
        Queue<Integer> keys2 = tree.midErgodic();
        for (Integer key : keys2) {
            System.out.println(tree.get(key));
        }
        System.out.println("========================================");
        Queue<Integer> keys3 = tree.afterErgodic();
        for (Integer key : keys3) {
            System.out.println(tree.get(key));
        }
        System.out.println("========================================");
        Queue<Integer> keys4 = tree.layerErgodic();
        for (Integer key : keys4) {
            System.out.println(tree.get(key));
        }
        System.out.println("===================");
        System.out.println(tree.maxDepth());
    }
}
