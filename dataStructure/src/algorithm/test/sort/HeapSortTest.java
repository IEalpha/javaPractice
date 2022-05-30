package algorithm.test.sort;

import algorithm.sort.heap.HeapSort;

import java.util.Arrays;

/**
 * @author LiuHanxu
 * @Classname HeapSortTest
 * @Description TODO 堆排序测试
 * @Date 2022/5/30 15:22
 */
public class HeapSortTest {
    public static void main(String[] args) {
        String[] arr = {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
        HeapSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
