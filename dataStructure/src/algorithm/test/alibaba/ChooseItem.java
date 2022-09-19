package algorithm.test.alibaba;

import java.util.Scanner;

/**
 * @author LiuHanxu
 * @Classname ChooseItem
 * @Description TODO
 * @Date 2022/9/14 20:19
 */
public class ChooseItem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n1 = sc.nextInt();
            int[] nums1 = new int[n1];
            String string1 = sc.next();
            String[] strings1 = string1.split(" ");
            for (int j = 0; j < n1; j++) {
                nums1[j] = Integer.parseInt(strings1[j]);
            }
            int n2 = sc.nextInt();
            int[] nums2 = new int[n2];
            String string2 = sc.next();
            String[] strings2 = string2.split(" ");
            for (int j = 0; j < n2; j++) {
                nums2[j] = Integer.parseInt(strings2[j]);
            }
            
        }
    }
}
