package algorithm.heap;

/**
 * @author LiuHanxu
 * @Classname Heap
 * @Description TODO 堆
 * @Date 2022/5/29 14:20
 */
public class Heap<T extends Comparable<T>> {
    private T[] items;
    private int N;

    public Heap(int capacity) {
        this.items = (T[]) new Comparable[capacity + 1];
        this.N = 0;
    }

    //判断索引i是否小于j处元素
    private boolean less(int i, int j) {
        return items[i].compareTo(items[j]) < 0;
    }

    //交换ij索引处元素
    private void exchange(int i, int j) {
        T temp = items[i];
        items[i] = items[j];
        items[j] = temp;
    }

    //插入元素
    public void insert(T t) {
        items[++N] = t;
        swim(N);
    }

    //使用上浮算法，使索引k处的元素能在堆中处于一个正确的位置
    private void swim(int k) {
        while (k > 1) {
            if (less(k / 2, k)) {
                exchange(k / 2, k);
                k = k / 2;
            } else {
                break;
            }
        }
    }

    //删除堆中最大的元素并返回这个元素
    public T delMax() {
        T max = items[1];
        exchange(1, N);
        items[N] = null;
        N--;
        sink(1);
        return max;
    }

    //使用下沉算法，使索引k处的元素能在堆中处于一个正确的位置
    private void sink(int k) {
        while (2 * k <= N) {
            int max;
            if (2 * k + 1 < N) {
                if (less(2 * k, 2 * k + 1)) {
                    max = 2 * k + 1;
                } else {
                    max = 2 * k;
                }
            } else {
                max = 2 * k;
            }
            if (!less(k, max)) {
                break;
            } else {
                exchange(k, max);
                k = max;
            }
        }
    }
}
