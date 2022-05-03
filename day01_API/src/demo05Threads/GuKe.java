package demo05Threads;

/**
 * @author LiuHanxu
 * @Classname GuKe
 * @Description TODO
 * @Date 2022/3/21 15:14
 */
public class GuKe extends Thread{
    private BaoZi baoZi;
    public GuKe(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (baoZi) {
                if (baoZi.flag == false) {
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("顾客正在吃" + baoZi.pi + baoZi.xian + "包子");
                baoZi.flag = false;
                baoZi.notify();
                System.out.println("顾客已经把" + baoZi.pi + baoZi.xian + "包子吃完，包子铺开始生产包子");
                System.out.println("======================================");
            }
        }
    }
}
