package algorithm.linear;

import org.w3c.dom.Node;

import java.util.Iterator;

/**
 * @author LiuHanxu
 * @Classname LinkList
 * @Description TODO 链表
 * @Date 2022/5/4 16:18
 */
public class LinkList<T> implements Iterable<T> {
    private Node head;
    private int N;



    //成员内部类
    public class Node {
        T item;
        Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    public LinkList() {
        this.head = new Node(null, null);
        this.N = 0;
    }

    //清空链表
    public void clear() {
        head.next = null;
        this.N = 0;
    }

    //判空
    public boolean isEmpty() {
        return this.N == 0;
    }

    //获取链表长度
    public int length() {
        return this.N;
    }

    //读取并返回第i个元素
    public T get(int i) {
        Node n = head.next;
        for (int j = 0; j < i; j++) {
            n = n.next;
        }
        return n.item;
    }

    //添加一个元素
    public void insert(T t) {
        //找到当前最后一个节点
        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        //创建新节点，保存元素t
        Node newNode = new Node(t, null);
        //让当前最后一个节点指向新节点
        n.next = newNode;
        //N++
        this.N++;
    }

    //在第i个元素之前插入一个t
    public void insert(int i, T t) {
        Node n = head;
        for (int j = 0; j < i; j++) {
            n = n.next;
        }
        Node newNode = new Node(t, n.next);
        n.next = newNode;
        this.N++;
    }

    //删除并返回第i个元素
    public T remove(int i) {
        Node n = head;
        for (int j = 0; j < i; j++) {
            n = n.next;
        }
        Node node = n.next;
        n.next = n.next.next;
        this.N--;
        return node.item;
    }

    //返回首次出现的指定元素的序号，不存在返回-1
    public int indexOf(T t) {
        Node n = head;
        for (int i = 0; i < this.N; i++) {
            n = n.next;
            if (n.item.equals(t)) {
                return i;
            }
        }
        return -1;
    }

    //遍历
    @Override
    public Iterator<T> iterator() {
        return new LIterator();
    }

    private class LIterator implements Iterator {

        private Node n;

        public LIterator() {
            this.n = head;
        }
        @Override
        public boolean hasNext() {
            return n.next != null;
        }

        @Override
        public Object next() {
            n = n.next;
            return n.item;
        }
    }
}
