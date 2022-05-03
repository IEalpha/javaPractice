package algorithm.sort.advanced;

/**
 * @author LiuHanxu
 * @Classname Quick
 * @Description TODO 快速排序
 * @Date 2022/4/29 9:55
 */
public class Quick {
    public static void sort(Comparable[] a) {
        int lo = 0;
        int hi = a.length - 1;
        sort(a, lo, hi);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        //安全性校验
        if (hi <= lo) {
            return;
        }
        //对数组中lo索引到hi索引处的元素分组
        int partition = partition(a, lo, hi);
        //让左边有序
        sort(a, lo, partition - 1);
        //让右边有序
        sort(a, partition + 1, hi);
    }

    public static int partition(Comparable[] a, int lo, int hi) {
        //确定分界值
        Comparable key = a[lo];
        //定义两个指针，分别指向最小和最大索引处
        int left = lo;
        int right = hi + 1;
        while (true) {
            while (less(key, a[--right])) {
                if (right == lo) {
                    break;
                }
            }
            while(less(a[++left], key)) {
                if (left == hi) {
                    break;
                }
            }
            if (left >= right) {
                break;
            } else {
                exchange(a, left, right);
            }
        }
        exchange(a, lo, right);
        return right;
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exchange(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
