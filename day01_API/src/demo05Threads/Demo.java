package demo05Threads;

/**
 * @author LiuHanxu
 * @Classname Demo
 * @Description 等待于唤醒线程
 * @Date 2022/3/21 15:17
 */
public class Demo {
    public static void main(String[] args) {
        BaoZi baoZi = new BaoZi();
        new BaoZiPu(baoZi).start();
        new GuKe(baoZi).start();
    }
}
