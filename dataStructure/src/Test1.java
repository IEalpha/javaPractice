/**
 * @author LiuHanxu
 * @Classname Test1
 * @Description TODO str1是否包含str2，包含返回第一次出现的位置，不包含返回-1
 * @Date 2022/4/27 15:32
 */
public class Test1 {
    public static void main(String[] args) {
        long l1 = System.currentTimeMillis();
        sum2();
        long l2 = System.currentTimeMillis();
        System.out.println(l2 - l1);
    }

    private static void sum1() {
        int sum = 0;
        int n = 1000000;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    private static void sum2() {
        int sum = 0;
        int n = 1000000;
        sum = (n + 1) * n / 2;
        System.out.println(sum);
    }
}
