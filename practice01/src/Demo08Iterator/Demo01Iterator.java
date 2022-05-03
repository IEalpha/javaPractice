package Demo08Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo01Iterator {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("北京");
        coll.add("上海");
        coll.add("广州");
        coll.add("深圳");
        coll.add("曹县");
        Iterator<String> iterator = coll.iterator();
        for (int i = 0;i < coll.size(); i++) {
            boolean b = iterator.hasNext();
            System.out.println(b);
            String s = iterator.next();
            System.out.println("s[" + i + "] = " + s);
        }
    }
}
