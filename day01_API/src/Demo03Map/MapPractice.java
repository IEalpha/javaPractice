package Demo03Map;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("输入的字符串为：\n" + s);
        long l1 = System.currentTimeMillis();
        Map<Character, Integer> map = new HashMap<>();
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<Character, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Character, Integer> entry = iterator.next();
            Character c = entry.getKey();
            Integer times = entry.getValue();
            System.out.println(c + "出现了" + times + "次；");
        }
        long l2 = System.currentTimeMillis();
        System.out.println(l2 - l1);
    }
}
