package algorithm.priority;

/**
 * @author LiuHanxu
 * @Classname MinPriorityQueue
 * @Description TODO 最小优先队列
 * @Date 2022/5/30 16:47
 */
public class MinPriorityQueue<T extends Comparable<T>> {
    private T[] items;
    private int N;

    public MinPriorityQueue(int capacity) {
        this.items = (T[]) new Comparable[capacity + 1];
        this.N = 0;
    }

    private boolean less(int i, int j) {
        return items[i].compareTo(items[j]) < 0;
    }

    private void exchange(int i, int j) {
        T temp = items[i];
        items[i] = items[j];
        items[j] = temp;
    }

    public T delMin() {
        T min = items[1];
        exchange(1, N);
        items[N] = null;
        N--;
        sink(1);
        return min;
    }

    public void insert(T t) {
        items[++N] = t;
        swim(N);
    }

    private void swim(int k) {
        while (k > 1) {
            if (less(k, k / 2)) {
                exchange(k, k / 2);
            }
            k /= 2;
        }
    }

    private void sink(int k) {
        while (2 * k <= N) {
            int min = 2 * k;
            if (2 * k + 1 <= N && less(2 * k + 1, 2 * k)) {
                min = 2 * k + 1;
            }
            if (less(k, min)) {
                break;
            }
            exchange(k, min);
            k = min;
        }
    }

    public int size() {
        return this.N;
    }

    public boolean isEmpty() {
        return this.N == 0;
    }
}
