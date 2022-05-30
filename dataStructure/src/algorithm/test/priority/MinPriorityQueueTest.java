package algorithm.test.priority;

import algorithm.priority.MaxPriorityQueue;
import algorithm.priority.MinPriorityQueue;

/**
 * @author LiuHanxu
 * @Classname MinPriorityQueueTest
 * @Description TODO 最小优先队列测试
 * @Date 2022/5/30 17:01
 */
public class MinPriorityQueueTest {
    public static void main(String[] args) {
        MinPriorityQueue<Integer> queue = new MinPriorityQueue<>(10);
        queue.insert(111);
        queue.insert(2);
        queue.insert(3);
        queue.insert(23);
        queue.insert(5);
        queue.insert(9);
        queue.insert(8);
        System.out.println(queue.size());
        System.out.println("=============================3");
        while (!queue.isEmpty()) {
            System.out.println(queue.delMin());
        }
    }
}
