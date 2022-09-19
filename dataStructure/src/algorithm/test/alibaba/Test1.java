package algorithm.test.alibaba;

import java.util.*;

/**
 * @author LiuHanxu
 * @Classname Test1
 * @Description TODO
 * @Date 2022/9/15 19:59
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int result = 0;
        int fast = 0;
        int slow = 0;
        for (slow = 0; slow < s.length(); slow++) {
            for (fast = slow + 1; fast <= s.length(); fast++) {
                String s1 = s.substring(slow, fast);
                if (ifGood(s1)) {
                    result++;
                }
            }
        }
        System.out.println(result);
//        ifGood("ab");
    }

    private static boolean ifGood(String str) {
        Map<String, Integer> map = new HashMap<>();
        //String[] strs = str.split("");
            List<String> strs =  new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            strs.add(String.valueOf(str.charAt(i)));
        }
        for (String s : strs) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        int num = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                num++;
            }
            if (num >= 2) {
                return false;
            }
        }
        return num == 1;
    }
}
