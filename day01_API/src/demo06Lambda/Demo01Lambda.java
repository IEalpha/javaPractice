package demo06Lambda;

/**
 * @author LiuHanxu
 * @Classname Demo01Lambda
 * @Description Lambda表达式
 * @Date 2022/3/21 15:23
 */
public class Demo01Lambda {
    public static void main(String[] args) {
        //匿名内部类实现多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " 新线程创建了");
            }
        }).start();

        //使用Lambda表达式实现多线程
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " 新线程创建了");
        }).start();
    }
}
