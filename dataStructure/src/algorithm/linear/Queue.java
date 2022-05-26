package algorithm.linear;

import java.util.Iterator;

/**
 * @author LiuHanxu
 * @Classname Queue
 * @Description TODO 队列
 * @Date 2022/5/14 16:56
 */
public class Queue<T> implements Iterable<T> {
    private Node head;
    private Node last;
    private int N;


    private class Node {
        public T item;
        public Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    public Queue() {
        this.head = new Node(null, null);
        this.last = null;
        this.N = 0;
    }

    public boolean isEmpty() {
        return this.N == 0;
    }

    public int size() {
        return this.N;
    }

    //插入元素
    public void enqueue(T t) {
        if (isEmpty()) {
            this.head.next = new Node(t, null);
            this.last = this.head.next;
        } else {
            this.last.next = new Node(t, null);
            this.last = this.last.next;
        }
        this.N++;
    }

    //从队列中去除元素
    public T dequeue() {
        if (isEmpty()) {
            return null;
        } else if (this.size() == 1) {
            T t = this.head.next.item;
            this.head.next = null;
            this.last = null;
            this.N--;
            return t;
        } else {
            T t = this.head.next.item;
            this.head.next = this.head.next.next;
            this.N--;
            return t;
        }
    }
    @Override
    public Iterator<T> iterator() {
        return new QIterator();
    }

    private class QIterator implements Iterator<T> {

        private Node node;

        public QIterator() {
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
