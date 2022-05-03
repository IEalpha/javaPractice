package demo05Threads;

/**
 * @author LiuHanxu
 * @Classname BaoZiPu
 * @Description TODO
 * @Date 2022/3/21 15:04
 */
public class BaoZiPu extends Thread{
    private BaoZi baoZi;
    public BaoZiPu(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            synchronized (baoZi) {
                if (baoZi.flag == true) {
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (count % 2 == 0) {
                    baoZi.pi = "薄皮";
                    baoZi.xian = "三鲜馅";
                } else {
                    baoZi.pi = "冰皮";
                    baoZi.xian = "牛肉大葱馅";
                }
                count++;
                System.out.println("包子铺正在生产" + baoZi.pi + baoZi.xian + "包子");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                baoZi.flag = true;
                baoZi.notify();
                System.out.println("包子生产好" + baoZi.pi + baoZi.xian + "包子，可以吃了");
            }
        }
    }
}
