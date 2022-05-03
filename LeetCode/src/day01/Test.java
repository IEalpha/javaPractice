package day01;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("s");
        list.add("h");
        list.add("e");
        list.add("r");
        list.add("i");
        list.add("t");
        System.out.println(list.contains(String.valueOf('e')));
    }
}
