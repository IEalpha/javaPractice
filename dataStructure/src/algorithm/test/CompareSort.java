package algorithm.test;

import algorithm.sort.Insert;
import algorithm.sort.advanced.Merge;
import algorithm.sort.advanced.Shell;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LiuHanxu
 * @Classname CompareShellAndInsert
 * @Description TODO
 * @Date 2022/4/28 19:57
 */
public class CompareSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 100000; i > 0 ; i--) {
            list.add(i);
        }
        Integer[] arr = list.toArray(new Integer[0]);
//        shellTest(arr);
//        insertTest(arr);
        mergeTest(arr);
    }

    private static void shellTest(Integer[] a) {
        long l1 = System.currentTimeMillis();
        Shell.sort(a);
        long l2 = System.currentTimeMillis();
        System.out.println((l2 - l1));
    }

    private static void insertTest(Integer[] a) {
        long l1 = System.currentTimeMillis();
        Insert.sort(a);
        long l2 = System.currentTimeMillis();
        System.out.println((l2 - l1));
    }

    private static void mergeTest(Integer[] a) {
        long l1 = System.currentTimeMillis();
        Merge.sort(a);
        long l2 = System.currentTimeMillis();
        System.out.println((l2 - l1));
    }
}
