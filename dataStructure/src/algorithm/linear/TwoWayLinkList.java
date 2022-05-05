package algorithm.linear;

import org.w3c.dom.Node;

import java.util.Iterator;

/**
 * @author LiuHanxu
 * @Classname TwoWayLinkList
 * @Description TODO
 * @Date 2022/5/5 10:32
 */
public class TwoWayLinkList<T> implements Iterable<T> {
    private Node head;
    private Node last;
    private int N;


    private class Node {
        private T item;
        private Node pre;
        private Node next;

        public Node(T item, Node pre, Node next) {
            this.item = item;
            this.pre = pre;
            this.next = next;
        }
    }

    public TwoWayLinkList() {
        this.head = new Node(null, null, null);
        this.last = new Node(null, null, null);
        this.N = 0;
    }

    public void clear() {
        this.head.next = null;
        this.last.pre = null;
        this.last = null;
        this.N = 0;
    }

    public int length() {
        return this.N;
    }

    public boolean isEmpty() {
        return this.N == 0;
    }

    public T getFirst() {
        if (isEmpty()) {
            return null;
        }
        return this.head.next.item;
    }

    public T getLast() {
        if (isEmpty()) {
            return null;
        }
        return this.last.item;
    }

    public void insert(T t) {
        if (isEmpty()) {
            this.last = new Node(t, head, null);
            this.head.next = this.last;
        } else {
            Node newNode = new Node(t, this.last, null);
            this.last.next = newNode;
            this.last = newNode;
        }
        this.N++;
    }

    public void insert(int i, T t) {
        if (i > this.N) {
            return;
        }
        Node node = this.head;
        for (int j = 0; j <= i; j++) {
            node = node.next;
        }
        Node newNode = new Node(t, node, node.next);
        node.next.pre = newNode;
        node.next = newNode;
        this.N++;
    }

    public T get(int i) {
        Node node = this.head.next;
        for (int j = 0; j < i; j++) {
            node = node.next;
        }
        return node.item;
    }

    public int indexOf(T t) {
        Node node = this.head;
        for (int i = 0; i < this.N; i++) {
            node = node.next;
            if (t.equals(node.item)) {
                return i;
            }
        }
        return -1;
    }

    public T remove(int i) {
        Node node = this.head.next;
        for (int j = 0; j < i; j++) {
            node = node.next;
        }
        node.pre.next = node.next;
        node.next.pre = node.pre;
        this.N--;
        return node.item;
    }

    @Override
    public Iterator<T> iterator() {
        return new TIterator();
    }

    private class TIterator implements Iterator {

        private TwoWayLinkList.Node node;

        public TIterator() {
            this.node = head;
        }

        @Override
        public boolean hasNext() {
            return node.next!= null;
        }

        @Override
        public Object next() {
            node = node.next;
            return node.item;
        }
    }
}
