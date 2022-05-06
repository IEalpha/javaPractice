package algorithm.test.linear;

/**
 * @author LiuHanxu
 * @Classname FastSlowTest
 * @Description TODO 快慢指针查找中间值
 * @Date 2022/5/6 17:01
 */
public class FastSlowTest {
    public static void main(String[] args) {
        Node<String> first = new Node<>("aa", null);
        Node<String> second = new Node<>("bb", null);
        Node<String> third = new Node<>("cc", null);
        Node<String> fourth = new Node<>("dd", null);
        Node<String> fifth = new Node<>("ee", null);
        Node<String> sixth = new Node<>("ff", null);
        Node<String> seventh = new Node<>("gg", null);
        Node<String> eighth = new Node<>("hh", null);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eighth;

        System.out.println(getMid(first));
    }

    public static String getMid(Node<String> first) {
        Node<String> fast = first;
        Node<String> slow = first;
        while (fast.next != null) {
            if (fast.next.next != null) {
                fast = fast.next.next;
            } else {
                fast = fast.next;
            }
            slow = slow.next;
        }
        return slow.item;
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
