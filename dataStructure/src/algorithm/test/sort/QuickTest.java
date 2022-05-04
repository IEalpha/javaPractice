package algorithm.test.sort;

import algorithm.sort.advanced.Quick;

import java.util.Arrays;

/**
 * @author LiuHanxu
 * @Classname QuickTest
 * @Description TODO
 * @Date 2022/4/29 10:22
 */
public class QuickTest {
    public static void main(String[] args) {
        Integer[] a = {4, 3, 6, 9,28,5, 2, 1,5,3};
        Quick.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
