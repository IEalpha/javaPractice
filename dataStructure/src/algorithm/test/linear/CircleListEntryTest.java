package algorithm.test.linear;

/**
 * @author LiuHanxu
 * @Classname FastSlowTest
 * @Description TODO 有环单向链表入口查找
 * @Date 2022/5/6 17:01
 */
public class CircleListEntryTest {
    public static void main(String[] args) {
        Node<String> first = new Node<>("aa", null);
        Node<String> second = new Node<>("bb", null);
        Node<String> third = new Node<>("cc", null);
        Node<String> fourth = new Node<>("dd", null);
        Node<String> fifth = new Node<>("ee", null);
        Node<String> sixth = new Node<>("ff", null);
        Node<String> seventh = new Node<>("gg", null);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
//        seventh.next = sixth;

        System.out.println(getEntrance(first) == null ? "Not a circled linkList" : getEntrance(first).item);
    }

    public static Node<String> getEntrance(Node<String> first) {
        Node<String> fast = first;
        Node<String> slow = first;
        while (fast.next != null) {
            if (fast.next.next != null) {
                fast = fast.next.next;
            } else {
                fast = fast.next;
            }
            slow = slow.next;
            if (fast.equals(slow)) {
                Node<String> temp = first;
                while (!temp.equals(slow)) {
                    temp = temp.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
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
