package algorithm.test.sort;

import algorithm.sort.Bubble;

import java.util.Arrays;

/**
 * @author LiuHanxu
 * @Classname BubbleTest
 * @Description TODO Bubble类测试
 * @Date 2022/4/28 15:14
 */
public class BubbleTest {
    public static void main(String[] args) {
        Integer[] arr = {4, 3, 6, 5, 2, 1};
        Bubble.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
