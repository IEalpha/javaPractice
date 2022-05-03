package Demo07Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Test01 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("hello");
        collection.add("world");
        collection.add("hello");
        collection.add("hello2");

        System.out.println(collection);

        boolean success = collection.remove("hello");
        boolean success1 = collection.remove("hello");
        System.out.println(success);
        System.out.println(collection);

        System.out.println(collection.getClass());
    }
}
