package algorithm.test.priority;

import algorithm.priority.MaxPriorityQueue;

/**
 * @author LiuHanxu
 * @Classname MaxPriorityQueueTest
 * @Description TODO
 * @Date 2022/5/30 16:38
 */
public class MaxPriorityQueueTest {
    public static void main(String[] args) {
        MaxPriorityQueue<Integer> queue = new MaxPriorityQueue<>(10);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(23);
        queue.insert(5);
        queue.insert(9);
        queue.insert(8);
        System.out.println(queue.size());
        while (!queue.isEmpty()) {
            System.out.println(queue.delMax());
        }
    }
}
