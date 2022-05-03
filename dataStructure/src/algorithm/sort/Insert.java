package algorithm.sort;

/**
 * @author LiuHanxu
 * @Classname Insert
 * @Description TODO 插入排序
 * @Date 2022/4/28 16:21
 */
public class Insert {
    public static void sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (greater(a[j], a[j + 1])) {
                    exchange(a, j + 1, j);
                } else {
                    break;
                }
            }
        }
    }

    private static boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }

    private static void exchange(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
