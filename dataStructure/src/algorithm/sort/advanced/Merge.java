package algorithm.sort.advanced;

import java.util.Arrays;

/**
 * @author LiuHanxu
 * @Classname Merge
 * @Description TODO 归并排序
 * @Date 2022/4/29 10:49
 */
public class Merge {

    private static Comparable[] assist;

    public static void sort(Comparable[] a) {
        //1.初始化辅助数组assist
        assist = new Comparable[a.length];
        //2.定义一个lo和hi分别记录最小和最大索引
        int lo = 0;
        int hi = a.length - 1;
        //3.调用sort重载对lo和hi之间元素排序
        sort(a, lo, hi);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        //安全性校验
        if (lo >= hi) {
            return;
        }
        //对 lo到hi之间数据分组
        int mid = (hi + lo) / 2;
        //分别对每一组排序
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        //两个组中数据归并
        merge(a, lo, mid, hi);
    }

    private static void merge(Comparable[] a, int lo, int mid, int hi) {
        //1.定义三个指针
        int i = lo;
        int p1 = lo;
        int p2 = mid + 1;
        //2.遍历，移动p1和p2指针，比较对应索引的值将小的放到对应索引处
        while (p1 <= mid && p2 <= hi) {
            if (less(a[p1], a[p2])) {
                assist[i++] = a[p1++];
            } else {
                assist[i++] = a[p2++];
            }
        }
        //3.遍历，如果p1指针没有走完，你们顺序移动p1把对应的元素放到辅助数组的对应索引处
        while (p1 <= mid) {
            assist[i++] = a[p1++];
        }
        //3.遍历，如果p2指针没有走完，你们顺序移动p2把对应的元素放到辅助数组的对应索引处
        while (p2 <= hi) {
            assist[i++] = a[p2++];
        }
        //4.辅助数组中的元素copy到原数组中
        for (int j = lo; j <= hi; j++) {
            a[j] = assist[j];
        }
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
