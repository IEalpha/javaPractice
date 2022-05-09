package algorithm.linear;

import java.util.Iterator;

/**
 * @author LiuHanxu
 * @Classname Stack
 * @Description TODO 栈
 * @Date 2022/5/9 20:12
 */
public class Stack<T> implements Iterable<T> {
    private Node head;
    private int N;


    private class Node {
        private T item;
        private Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    public Stack() {
        this.head = new Node(null, null);
        this.N = 0;
    }

    public boolean isEmpty() {
        return this.N == 0;
    }

    public int size() {
        return this.N;
    }

    //压栈
    public void push(T t) {
        if (!isEmpty()) {
            this.head.next = new Node(t, this.head.next);
        } else {
            this.head.next = new Node(t, null);
        }
        this.N++;
    }

    //弹栈
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        Node node = this.head.next;
        this.head.next = this.head.next.next;
        this.N--;
        return node.item;
    }

    @Override
    public Iterator<T> iterator() {
        return new SIterator();
    }

    private class SIterator implements Iterator<T> {

        private Node node;

        public SIterator() {
            this.node = head;
        }

        @Override
        public boolean hasNext() {
            return node.next != null;
        }

        @Override
        public T next() {
            node = node.next;
            return node.item;
        }
    }

}
