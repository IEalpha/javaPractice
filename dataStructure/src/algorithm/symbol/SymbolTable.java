package algorithm.symbol;

import java.util.Iterator;

/**
 * @author LiuHanxu
 * @Classname SymbolTable
 * @Description TODO
 * @Date 2022/5/16 10:52
 */
public class SymbolTable<Key, Value>{

    private Node head;
    private int N;

    private class Node {
        private Key key;
        private Value value;
        private Node next;

        public Node(Key key, Value value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    public SymbolTable() {
        this.head = new Node(null, null, null);
        this.N = 0;
    }

    public Value get(Key key) {
        Node node = this.head;
        for (int i = 0; i < this.N; i++) {
            node = node.next;
            if (node.key == key) {
                return node.value;
            }
        }
        return null;
    }

    public void put(Key key, Value value) {
        Node node = this.head;
        for (int i = 0; i < this.N; i++) {
            node = node.next;
            if (node.key == key) {
                node.value = value;
                return;
            }
        }
        node.next = new Node(key, value, null);
        this.N++;
    }

    public Value delete(Key key) {
        Node node = this.head;
        Node pre = this.head;
        for (int i = 0; i < this.N; i++) {
            node = node.next;
            if (node.key == key) {
                Value value = node.value;
                pre.next = node.next;
                this.N--;
                return value;
            }
            pre = pre.next;
        }
        return null;
    }

    public int size() {
        return this.N;
    }

}
