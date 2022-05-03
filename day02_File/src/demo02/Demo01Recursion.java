package demo02;

/**
 * @author LiuHanxu
 * @Classname Demo01Recursion
 * @Description TODO
 * @Date 2022/3/23 16:00
 */
public class Demo01Recursion {
    public static void main(String[] args) {
//        a();
//        b(1);
//        System.out.println(sum(16));
        int result = factorial(8);
        System.out.println(result);
    }

    /**
     * 计算n的阶乘
     * @param n
     * @return
     */
    private static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    /**
     * 利用递归求和1 + 2 + ... + i 的和
     * @param i
     */
    private static int sum(int i) {
        if (i == 1) {
            return 1;
        }
        return i + sum(i - 1);
    }

    /**
     * 递归要有停止条件，否则会栈内存溢出，报StackOverflow错误
     */
    private static void a() {
        System.out.println("a");
        a();
    }

    /**
     * 递归次数不能太多，太多则会栈内存溢出，报StackOverflow错误
     * @param i
     */
    private static void b(int i) {
        System.out.println(i);
        if (i == 25000) {
            return;
        }
        b(++i);
    }
}
