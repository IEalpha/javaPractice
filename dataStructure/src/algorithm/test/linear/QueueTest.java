package algorithm.test.linear;

import algorithm.linear.LinkList;
import algorithm.linear.Queue;

/**
 * @author LiuHanxu
 * @Classname LinkListTest
 * @Description TODO 单向链表测试
 * @Date 2022/5/4 16:58
 */
public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> links = new Queue<>();
        links.enqueue(1);
        links.enqueue(2);
        links.enqueue(3);
        links.enqueue(4);
        for (Integer link : links) {
            System.out.println(link);
        }
        int size = links.size();
        while (!links.isEmpty()) {

            System.out.println(links.dequeue());
        }
        System.out.println(links.isEmpty());
        System.out.println("=================");
        size = links.size();
        System.out.println(links.isEmpty());
    }
}
