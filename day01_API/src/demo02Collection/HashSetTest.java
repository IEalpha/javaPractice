package demo02Collection;

import java.util.*;

public class HashSetTest {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);
        for (Integer integer : set) {
            System.out.println(integer);
        }

        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(7);
        list.add(5);
        list.add(99);
        list.add(9);
        System.out.println(list);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
    }
}
