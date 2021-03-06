package algorithm.priority;

/**
 * @author LiuHanxu
 * @Classname MaxPriorityQueue
 * @Description TODO 最大优先队列, 跟堆几乎相同
 * @Date 2022/5/30 16:22
 */
public class MaxPriorityQueue<T extends Comparable<T>> {
    private T[] items;
    private int N;

    public MaxPriorityQueue(int capacity) {
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

    public T delMax() {
        T max = items[1];
        exchange(1, N);
        items[N] = null;
        N--;
        sink(1);
        return max;
    }

    public void insert(T t) {
        items[++N] = t;
        swim(N);
    }

    private void swim(int k) {
        while (k > 1) {
            if (less(k / 2, k)) {
                exchange(k / 2, k);
            }
            k /= 2;
        }
    }

    private void sink(int k) {
        while (2 * k <= N) {
            int max = 2 * k;
            if ((2 * k + 1 <= N) && less(2 * k, 2 * k + 1)) {
                max = 2 * k + 1;
            }
            if (!less(k, max)) {
                break;
            }
            exchange(k, max);
            k = max;
        }
    }

    public int size() {
        return this.N;
    }

    public boolean isEmpty() {
        return this.N == 0;
    }
}
