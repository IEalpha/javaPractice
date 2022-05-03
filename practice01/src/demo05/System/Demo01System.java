package demo05.System;

public class Demo01System {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
