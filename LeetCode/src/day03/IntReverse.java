package day03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author LiuHanxu
 * @Classname IntReverse
 * @Description TODO 如下：
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * <p>
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Date 2022/4/21 20:30
 */
public class IntReverse {
    public static void main(String[] args) {
        int x = -2147483648;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        int newX = x;
        if (x == 0 || x == -2147483648) {
            return 0;
        } else if (x < 0){
            newX = -x;
        }
        String strX = String.valueOf(newX);
        List<String> charXList = new ArrayList<>();
        for (int i = 0; i < strX.length(); i++) {
            charXList.add(String.valueOf(strX.charAt(i)));
        }
        Collections.reverse(charXList);
        StringBuilder resultSb = new StringBuilder();
        for (String s : charXList) {
            resultSb.append(s);
        }
        String resultStr = resultSb.toString();
        if (Long.parseLong(resultStr) >= Math.pow(2, 31) || Long.parseLong(resultStr) < -Math.pow(2, 31)) {
            return 0;
        } else {
            int resultInt = Integer.parseInt(resultStr);
            if (x < 0) {
                resultInt = -resultInt;
            }
            return resultInt;
        }
    }
}
