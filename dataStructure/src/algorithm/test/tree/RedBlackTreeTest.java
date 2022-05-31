package algorithm.test.tree;

import algorithm.tree.RedBlackTree;

/**
 * @author LiuHanxu
 * @Classname RedBlackTreeTest
 * @Description TODO 红黑树测试
 * @Date 2022/5/31 17:02
 */
public class RedBlackTreeTest {
    public static void main(String[] args) {
        RedBlackTree<Integer, Integer> redBlackTree = new RedBlackTree<>();
        redBlackTree.put(1,1);
        redBlackTree.put(2,2);
        redBlackTree.put(5,5);
        redBlackTree.put(6,6);
        redBlackTree.put(3,3);
        redBlackTree.put(4,4);
        System.out.println(redBlackTree.size());
        System.out.println("==================");
        System.out.println(redBlackTree.get(6));
        System.out.println(redBlackTree.get(3));
        System.out.println(redBlackTree.get(1));
        System.out.println(redBlackTree.get(7));
    }
}
