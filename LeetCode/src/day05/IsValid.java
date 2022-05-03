package day05;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LiuHanxu
 * @Classname IsValid
 * @Description TODO 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *              TODO 有效字符串需满足：
 *              TODO 1. 左括号必须用相同类型的右括号闭合。
 *              TODO 2. 左括号必须以正确的顺序闭合。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Date 2022/4/27 9:42
 */
public class IsValid {
    public static void main(String[] args) {
        String s = "[({(())}[()])]";
        System.out.println(isValid(s));
    }

    private static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        map.put('(', -1);
        map.put(')', 1);
        map.put('{', -2);
        map.put('}', 2);
        map.put('[', -3);
        map.put(']', 3);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += map.get(s.charAt(i));
        }
        if (sum != 0) {
            return false;
        }
        while (s.length() > 0) {
            for (int i = 0; i < s.length(); i++) {
                if (map.get(s.charAt(i)) > 0) {
                    if (i == 0) {
                        return false;
                    } else {
                        if (map.get(s.charAt(i - 1)) + map.get(s.charAt(i)) != 0) {
                            return false;
                        } else {
                            s = s.substring(0, i - 1) + s.substring(i + 1);
                            break;
                        }
                    }
                }
            }
        }
        return true;
    }
}
