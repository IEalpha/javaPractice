package algorithm.test.didi;

import java.util.Arrays;
import java.util.Scanner;

public class didi1 {
    public static void main(String[] args) {
        System.out.println("输入：");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] num1 = new int[m];
        int[] num2 = new int[n];
        // 换成其他数据类型也一样，其他数值类型就修改int跟nextInt就可以了，
        // String就把nextInt()换成next()
        for (int i = 0; i < m; i++) {
            num1[i] = sc.nextInt(); // 一个一个读取
        }
        for (int i = 0; i < n; i++) {
            num2[i] = sc.nextInt();
        }
        System.out.println("输出：");
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));
    }

    public static int solution(int n, int k, int[] a) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int weight = 0;
        int max = 0;
        while (i < n) {
            max = Math.max(max, a[i - 1]);
            weight += a[i - 1];
            if (weight / i > max / k) {
                i++;
            } else {
                break;
            }
        }
        return i;
    }
}
