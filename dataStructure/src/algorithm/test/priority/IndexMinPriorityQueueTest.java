package algorithm.test.priority;

import algorithm.priority.IndexMinPriorityQueue;

/**
 * @author LiuHanxu
 * @Classname IndexMinPriorityQueueTest
 * @Description TODO 索引最小优先队列测试
 * @Date 2022/5/30 21:27
 */
public class IndexMinPriorityQueueTest {
    public static void main(String[] args) {
        IndexMinPriorityQueue<Integer> queue = new IndexMinPriorityQueue<>(10);
        queue.insert(0,8);
        queue.insert(1,111);
        queue.insert(2,2);
        queue.insert(3,3);
        queue.insert(4,23);
        queue.insert(5,5);
        queue.insert(6,9);
        queue.changeItem(2, 2000);
        while (!queue.isEmpty()) {
            int index = queue.delMin();
            System.out.print(index + " ");
        }
    }
}
