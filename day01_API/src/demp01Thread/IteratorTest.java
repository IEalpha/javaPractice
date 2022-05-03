package demp01Thread;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<String> coll = new ArrayList<>();
        coll.add("hello");
        coll.add("world");
        coll.add("liu");
        coll.add("world");

        Iterator<String> it = coll.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("=============");

        for (int i = 0; i < coll.size(); i++) {
            System.out.println(coll.get(i));
        }
    }
}
