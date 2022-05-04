package algorithm.test.sort;

import algorithm.sort.advanced.Shell;

import java.util.Arrays;

/**
 * @author LiuHanxu
 * @Classname ShellTest
 * @Description TODO
 * @Date 2022/4/28 19:40
 */
public class ShellTest {
    public static void main(String[] args) {
        Integer[] arr = {9, 1, 2, 5, 7, 4, 8, 6, 3, 5};
        Shell.sort(arr);
        System.out.println("hei黑" + Arrays.toString(arr));
    }
}
