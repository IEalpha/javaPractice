package algorithm.test.sort;

import algorithm.sort.Insert;
import algorithm.sort.Selection;

import java.util.Arrays;

/**
 * @author LiuHanxu
 * @Classname InsertTest
 * @Description TODO
 * @Date 2022/4/28 16:37
 */
public class InsertTest {
    public static void main(String[] args) {
        Integer[] arr = {4,3,2,10,12,1,5,6};
        Insert.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
