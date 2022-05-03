package day03;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LiuHanxu
 * @Classname IsMatch
 * @Description TODO
 * 给你一个字符串 s 和一个字符规律 p，请你来实现一个支持 '.' 和 '*' 的正则表达式匹配。
 * <p>
 * '.' 匹配任意单个字符
 * '*' 匹配零个或多个前面的那一个元素
 * 所谓匹配，是要涵盖 整个 字符串 s的，而不是部分字符串。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/regular-expression-matching
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Date 2022/4/24 10:56
 */
public class IsMatch {
    public static void main(String[] args) {
        String s = "aa";
        String p = "a*";
        System.out.println(isMatch(s, p));
    }

    public static boolean isMatch(String s, String p) {
        int flagS = 0;
        int flagP = 0;
        while (flagS < s.length()) {
            if (flagP >= p.length()) {
                return false;
            }
            if (p.charAt(flagP) == '.' || p.charAt(flagP) == s.charAt(flagS)) {
                flagS++;
                flagP++;
            } else if (p.charAt(flagP) == '*') {
                if (s.charAt(flagS) != p.charAt(flagP - 1)) {

                }
            } else {
                flagP++;
                flagS = 0;
            }
        }
        return true;
    }
}
