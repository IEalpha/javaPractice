package algorithm.test.sort;

import algorithm.sort.advanced.Merge;

import java.util.Arrays;

/**
 * @author LiuHanxu
 * @Classname MergeTest
 * @Description TODO
 * @Date 2022/4/29 14:50
 */
public class MergeTest {
    public static void main(String[] args) {
        Integer[] arr = {8,4,5,7,1,3,6,2};
        Merge.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
