package demp01Thread;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class Efficiency {
    public static void main(String[] args) {
        demo02();
    }

    private static void demo02() {
        Collection<String> coll = new ArrayList<>();
        coll.add("hello");
        coll.add("world");
        coll.add("liu");
        coll.add("world");
        Collection<String> coll2 = new ArrayList<>();
        System.out.println(coll);
        coll2.add("world");
        coll.removeAll(coll2);
        System.out.println(coll);
        coll2.add("liu");
        coll.removeAll(coll2);
        System.out.println(coll);
        coll2.add("sgs");
        coll.removeAll(coll2);
        System.out.println(coll);
    }

    private static void demo01() {
        long s = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long e = System.currentTimeMillis();
        System.out.println(e - s);
    }
}
