package algorithm.test;

import algorithm.sort.Selection;

import java.util.Arrays;

/**
 * @author LiuHanxu
 * @Classname SelectionTest
 * @Description TODO
 * @Date 2022/4/28 15:45
 */
public class SelectionTest {
    public static void main(String[] args) {
        Integer[] arr = {4, 6, 8, 7, 9, 2, 10, 1};
        Selection.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
