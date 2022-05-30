package algorithm.priority;

/**
 * @author LiuHanxu
 * @Classname IndexMinPriorityQueue
 * @Description TODO 索引最小优先队列
 * @Date 2022/5/30 20:19
 */
public class IndexMinPriorityQueue<T extends Comparable<T>> {
    private T[] items;
    private int[] pq;//保存每个元素在items中的索引，pq数组堆有序
    private int[] qp;//保存pq的逆序，将pq的值作为索引，pq的索引作为值
    private int N;
    
    public IndexMinPriorityQueue(int capacity) {
        this.items = (T[]) new Comparable[capacity + 1];
        this.pq = new int[capacity + 1];
        this.qp = new int[capacity + 1];
        this.N = 0;
        for (int i = 0; i < qp.length; i++) {
            qp[i] = -1;
        }
    }

    //判断堆pq中i和j位置元素所对应的items中元素的大小
    private boolean less(int i, int j) {
        return items[pq[i]].compareTo(items[pq[j]]) < 0;
    }

    private void exchange(int i, int j) {
        int temp = pq[i];
        pq[i] = pq[j];
        pq[j] = temp;
        temp = qp[pq[i]];
        qp[pq[i]] = qp[pq[j]];
        qp[pq[j]] = temp;
    }

    //删除队列中最小的元素并返回该元素关联的索引
    public int delMin() {
        int minIndex = pq[1];
        exchange(1, N);
        qp[pq[N]] = -1;
        pq[N] = -1;
        items[minIndex] = null;
        N--;
        sink(1);
        return minIndex;
    }

    //队列中插入一个元素，并关联索引i
    public void insert(int i, T t) {
        if (contains(i)) {
            return;
        }
        N++;
        items[i] = t;
        pq[N] = i;
        qp[i] = N;
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
            if (2 * k + 1 <= N && !less(2* k, 2 * k + 1)) {
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

    //判断k对应的元素是否存在
    public boolean contains(int k) {
        return qp[k] != -1;
    }

    //把与索引i关联的元素修改为t
    public void changeItem(int i, T t) {
        items[i] = t;
        int k = qp[i];
        sink(k);
        swim(k);
    }

    //最小元素关联的索引
    public int minIndex() {
        return pq[1];
    }

    //删除索引i关联的元素
    public void delete(int i) {
        int k = qp[i];
        exchange(k, N);
        qp[pq[N]] = -1;
        pq[N] = -1;
        items[k] = null;
        N--;
        swim(k);
        sink(k);
    }
}
