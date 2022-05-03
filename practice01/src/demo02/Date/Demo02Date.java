package demo02.Date;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
    }

    private static void demo03() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);

    }

    private static void demo02() {
        Date date1 = new Date(0L);
        System.out.println("date1 = " + date1);
    }

    private static void demo01() {
        Date date = new Date();
        System.out.println("date = " + date);
    }
}
