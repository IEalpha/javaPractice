package demo09Generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo01Generic {
    public static void main(String[] args) {
//        show01();
        show02();
    }

    private static void show02() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("abc");
        list.add("1");

        for (String obj : list) {
            System.out.println(obj);
        }
    }

    private static void show01() {
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(1);

        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
