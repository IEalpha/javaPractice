package algorithm.test.linear;


import java.util.LinkedList;
import java.util.List;

/**
 * @author LiuHanxu
 * @Classname JosephTest
 * @Description TODO 循环链表解决约瑟夫问题
 * @Date 2022/5/7 11:00
 */
public class JosephTest {
    public static void main(String[] args) {
        Node<Integer> first = null;
        Node<Integer> pre = null;
        for (int i = 1; i <= 41; i++) {
            if (i == 1) {
                first = new Node<>(i, null);
                pre = first;
            } else {
                Node<Integer> newNode = new Node<>(i, null);
                pre.next = newNode;
                pre = newNode;
                if (i == 41) {
                    pre.next = first;
                }
            }
        }
        int count = 0;
        Node<Integer> n = first;
        Node<Integer> before = null;
        while(n != n.next && n != n.next.next) {
            count++;
            if (count == 3) {
                before.next = n.next;
                System.out.print(n.item + ",");
                count = 0;
                n = n.next;
            } else {
                before = n;
                n = n.next;
            }
        }
        System.out.println("======");
        System.out.println(n.item);
        System.out.println(n.next.item);
        System.out.println(n.next.next.item);
    }

    private static class Node<T> {
        T item;
        Node<T> next;

        public Node(T item, Node<T> next) {
            this.item = item;
            this.next = next;
        }
    }
}
